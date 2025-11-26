# -*- coding: utf-8 -*-
import pandas as pd
import logging
from pathlib import Path
from datetime import datetime
import re

from src.utils.deepseek_wrapper import DeepseekWrapper
from src.utils.gemini_wrapper import GeminiWrapper
from src.utils.gpt_wrapper import GPTAgent

# ------------------------ Logging ------------------------
log_file = "gpt_stylecheck_log.txt"
log_formatter = logging.Formatter(
    fmt="%(asctime)s [%(levelname)s] %(message)s",
    datefmt="%Y-%m-%d %H:%M:%S"
)
file_handler = logging.FileHandler(log_file, mode="w", encoding="utf-8")
file_handler.setFormatter(log_formatter)
logger = logging.getLogger()
logger.handlers.clear()
logger.addHandler(file_handler)
logger.setLevel(logging.INFO)

# ------------------------ Utils --------------------------
SR_PATTERN = re.compile(r'(SR\d+_[^/\\]+)')

def infer_sr_from_path(path_str: str) -> str:
    m = SR_PATTERN.search(str(path_str))
    return m.group(1) if m else ""

def pick_excel_engine():
    try:
        import xlsxwriter  # noqa
        return "xlsxwriter"
    except Exception:
        try:
            import openpyxl  # noqa
            return "openpyxl"
        except Exception:
            return None

def save_results_dataframe(out_df: pd.DataFrame, output_xlsx: str | Path):
    output_xlsx = Path(output_xlsx)
    engine = pick_excel_engine()
    if engine is None:
        csv_path = output_xlsx.with_suffix(".csv")
        out_df.to_csv(csv_path, index=False, encoding="utf-8-sig")
        return
    if output_xlsx.suffix.lower() != ".xlsx":
        output_xlsx = output_xlsx.with_suffix(".xlsx")
    with pd.ExcelWriter(output_xlsx, engine=engine) as writer:
        out_df.to_excel(writer, index=False, sheet_name="gpt_results")
    print(f"Output save to：{output_xlsx}（engine={engine}）")

# ------------------------ Prompt & Parse ------------------
lang = "Java"
spec = "Google Java Style Guide"
def build_prompt(file_path: str, code_text: str, sub_rule_name: str, sub_rule_text: str) -> str:
    return f"""
You are a {lang} coding-style checker. You will receive:
- A specific sub-rule from the {spec} (natural language).
- A {lang} source file with 1-based line numbers.

Task: strictly check violations of the provided sub-rule only. Ignore anything unrelated.

Reminders:
- Base your judgment solely on the given source text.
- Distinguish comments vs. code: ignore comments unless the sub-rule explicitly applies.
- Do not assume intent or rely on common patterns; judge only the text.
- If there is no violation for this sub-rule, output nothing.
- For ordering rules: take the first item as the baseline. Each later item must appear at the same or later position in the canonical order than the previous one; if not, report that item as a violation.
- For separating rules(A separator B): locate the violation on the first token of the latter entity B. Never locate the violation on the separator or blank line.
- For rules that require a preceding comment before an element B: if the comment is missing or invalid, set LineNum to B’s line and ViolationStartString to B’s first token; never use the comment line.

Procedure (follow strictly):
1) Traverse the code line by line.
2) Compare each line to the sub-rule.
3) When a violation is found, immediately output one line in the exact format below.
4) Continue to the end; do not skip or add explanations.

Output format (MUST be exact; one violation per line):
LineNum¦ViolationStartString¦ViolationDescription¦SubRule

Sub-rule to check:
SubRule: {sub_rule_name}
Text: {sub_rule_text}

{lang} file path:
{file_path}

{lang} source with line numbers:
{code_text}

Return only violation lines. No extra text.
""".strip()

def extract_violations(response: str):
    """解析 LLM 输出为结构化列表"""
    out = []
    logger.info(f"分析回答：\n{response}")
    for raw in (response or "").splitlines():
        s = raw.strip()
        if not s:
            continue
        parts = s.split("¦")
        if len(parts) != 4:
            logger.info(f"Wrong Format：{s}")
            continue
        try:
            ln = int(parts[0].strip())
        except ValueError:
            logger.info(f"Wrong line number：{s}")
            continue
        out.append({
            "LineNum": ln,
            "Start": parts[1].strip(),
            "Desc": parts[2].strip(),
            "SubRule": parts[3].strip(),
        })
    return out

# ------------------------ Core (One-to-One) ---------------
def analyze_one2one_from_benchmark(
    benchmark_csv,
    benchmark_root,
    agent,
    output_xlsx="llm_results.xlsx",
    model="gpt-5",
    temperature=0.0,
    strict_one_sr_per_file=True
):
    df = pd.read_csv(benchmark_csv)


    if "FilePath" not in df.columns and "SavePath" in df.columns:
        df = df.rename(columns={"SavePath": "FilePath"})
    if "FilePath" not in df.columns:
        raise ValueError("CSV must contain 'FilePath' (or 'SavePath').")


    for c in ["SubRuleName", "SubRuleContent", "Relationship", "Diversity",
              "DiversityComment", "Project", "RuleName", "RuleContent"]:
        if c not in df.columns:
            df[c] = ""


    df["SubRuleName"] = df["SubRuleName"].astype(str).str.strip()
    need_infer = df["SubRuleName"].eq("") | df["SubRuleName"].str.lower().eq("nan")
    df.loc[need_infer, "SubRuleName"] = df.loc[need_infer, "FilePath"].astype(str).apply(infer_sr_from_path)


    pairs = (
        df[["FilePath", "SubRuleName", "SubRuleContent", "Relationship",
            "Diversity", "DiversityComment", "Project", "RuleName", "RuleContent"]]
        .assign(FilePath=lambda d: d["FilePath"].astype(str).str.strip(),
                SubRuleName=lambda d: d["SubRuleName"].astype(str).str.strip())
        .query("SubRuleName != ''")
        .drop_duplicates(subset=["FilePath", "SubRuleName"], keep="first")
        .reset_index(drop=True)
    )
    if strict_one_sr_per_file:
        dup = pairs.duplicated(subset=["FilePath"], keep="first")
        if dup.any():
            skipped = pairs.loc[dup, ["FilePath", "SubRuleName"]]
            for _, r in skipped.iterrows():
                logger.warning(f"Processed：{r['FilePath']} -> {r['SubRuleName']}")
            pairs = pairs[~dup].reset_index(drop=True)

    logger.info("Work on (FilePath -> SubRuleName)：\n" + pairs.to_string(index=False))

    rows = []
    root = Path(benchmark_root)

    def _norm(p: Path) -> str:
        try:
            return str(p.resolve()).replace("\\", "/").lower()
        except Exception:
            return str(p).replace("\\", "/").lower()

    processed_files = set()



    for i, row in pairs.iterrows():
        rel_path = row["FilePath"]
        file_path = (root / rel_path)
        if not file_path.exists():
            logger.warning(f"⚠ File is not existed：{file_path}")
            continue


        file_key = _norm(file_path)
        if strict_one_sr_per_file and file_key in processed_files:
            logger.warning(f"⚠ Same file：{file_path}")
            continue
        processed_files.add(file_key)

        sub_rule_name = row["SubRuleName"]
        sub_rule_text = str(row.get("SubRuleContent", "") or "")
        relationship = str(row.get("Relationship", "") or "")
        diversity = str(row.get("Diversity", "") or "")
        diversity_comment = str(row.get("DiversityComment", "") or "")
        project_txt = str(row.get("Project", "") or "")
        rule_name = str(row.get("RuleName", "") or "")
        rule_content = str(row.get("RuleContent", "") or "")


        try:
            lines = file_path.read_text(encoding="utf-8").splitlines(keepends=True)
        except UnicodeDecodeError:
            lines = file_path.read_text(encoding="latin-1").splitlines(keepends=True)
        code_with_ln = ''.join(f'{j + 1:4d}: {ln}' for j, ln in enumerate(lines))

        print(f"\nRun onece：{file_path.name} | SR={sub_rule_name}")
        prompt = build_prompt(str(file_path), code_with_ln, sub_rule_name, sub_rule_text)

        try:
            resp = agent.get_response(prompt, model=model, temperature=temperature)
            logger.info(f"Ask {model}: \n{prompt}")
            logger.info(f"{model} Answer: \n{resp}")
            print(f"Complete {model}: {file_path.name}, sub_rule={sub_rule_name}")
        except Exception as e:
            logger.error(f"Asking {model} failed: {file_path} Error: {e}")
            continue

        for v in extract_violations(resp):
            ln = v["LineNum"]
            start = v["Start"]
            desc = v["Desc"]
            target_line = lines[ln - 1] if 1 <= ln <= len(lines) else ""
            col_num = target_line.find(start) + 1 if (start and target_line) else 1

            rows.append({
                "RuleName": rule_name,
                "RuleContent": rule_content,
                "SubRuleName": sub_rule_name,
                "SubRuleContent": sub_rule_text,
                "Relationship": relationship,
                "Diversity": diversity,
                "DiversityComment": diversity_comment,
                "Project": project_txt,
                "FilePath": str(rel_path),
                "LineNum": ln,
                "ColNum": col_num,
                "Violation": desc
            })
        if len(processed_files) == -1:
            break

    out_df = pd.DataFrame(rows, columns=[
        "RuleName","RuleContent","SubRuleName","SubRuleContent",
        "Relationship","Diversity","DiversityComment","Project",
        "FilePath","LineNum","ColNum","Violation"
    ])
    ts = datetime.now().strftime("%Y%m%d_%H%M%S")
    output_xlsx = Path(output_xlsx)
    if not str(output_xlsx).endswith(".xlsx"):
        output_xlsx = output_xlsx.with_suffix(".xlsx")


    from pathlib import Path as _P
    def _pick_engine():
        try:
            import xlsxwriter; return "xlsxwriter"
        except Exception:
            try: import openpyxl; return "openpyxl"
            except Exception: return None
    eng = _pick_engine()
    if eng is None:
        out_df.to_csv(output_xlsx.with_suffix(".csv"), index=False, encoding="utf-8-sig")
    else:
        with pd.ExcelWriter(output_xlsx, engine=eng) as writer:
            out_df.to_excel(writer, index=False, sheet_name=str(output_xlsx))
        print(f"Output save to：{output_xlsx}（engine={eng}）")


# ------------------------ Entry -------------------------
if __name__ == "__main__":

    # agent = GPTAgent()
    # agent = GeminiWrapper()
    agent = DeepseekWrapper()

    file_pattern = "deepseek"
    analyze_one2one_from_benchmark(
        benchmark_csv=r"benchmark_one_by_one_full.csv",
        benchmark_root=Path(r"../micro-benchmark"),
        agent=agent,
        output_xlsx=f"{file_pattern}_results.xlsx",
        # model="gpt-4o",
        model="deepseek-chat",
        # model="gemini-2.5-flash",
        # model="gpt-oss",
        temperature=0.0,
        strict_one_sr_per_file=True
    )
