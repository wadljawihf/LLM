import os
import re
import subprocess
import json
import csv
from pathlib import Path

from utils.convert_xlsx_csv import convert_file

# ========== Configuration ==========
CHECKSTYLE_JAR = "checkstyle-10.26.1-all.jar"  # jar path
OUTPUT_CSV = "checkstyle_results.csv"
PROJECT_ROOT = r"micro-benchmark"  # Benchmark root path

CATEGORY_LABELS = ["negative_manmade", "positive_manmade"]

# ========== Find Rules ==========
def find_all_rules(root_path):
    rule_dirs = []
    counter = 0
    for item in os.listdir(root_path):
        rule_path = os.path.join(root_path, item)
        if os.path.isdir(rule_path) and item.startswith("Rule"):
            print(f"[✔] Got a Rule: {item}")
            rule_dirs.append(rule_path)
            counter += 1
        # if counter == 10:
        #     break
    return rule_dirs

# ========== Read Rule ==========
def load_rule_metadata(rule_json_path):
    if not os.path.exists(rule_json_path):
        return {}
    with open(rule_json_path, encoding='utf-8') as f:
        try:
            data = json.load(f)
            result = {}
            for rule in data:
                rule_name = rule.get("rule", "")
                for sub in rule.get("sub_rules", []):
                    sub_rule = sub.get("sub_rule")
                    result[sub_rule] = {
                        "RuleContent": rule_name,
                        "SubRuleContent": sub.get("content", ""),
                        "Relationship": sub.get("relationship", "")
                    }
            return result
        except Exception as e:
            print(f"[ERROR] Failed to parse {rule_json_path}: {e}")
            return {}

# ========== Read explain.json ==========
def load_explanation(explain_json_path):
    if not os.path.exists(explain_json_path):
        return {}
    with open(explain_json_path, encoding='utf-8') as f:
        try:
            data = json.load(f)
            return {
                item["sub_rule"]: {
                    "SupportLevel": item.get("support_level", ""),
                    "Explanation": item.get("explanation", ""),
                    "Project": item.get("related_configuration", "")
                }
                for item in data
            }
        except Exception as e:
            print(f"[ERROR] Failed to parse {explain_json_path}: {e}")
            return {}

# ========== Run Checkstyle ==========
def run_checkstyle_on_file(config_path, java_file_path):
    try:
        print(f"Run checkstyle on {Path(java_file_path).name}")
        cmd = [
            "java", "-jar", CHECKSTYLE_JAR,
            "-c", config_path,
            java_file_path
        ]
        result = subprocess.run(cmd, capture_output=True, text=True, timeout=10)
        return result.stdout.strip()
    except Exception as e:
        return f"ERROR: {str(e)}"

# ========== extract violations ==========
import re
def extract_violations(checkstyle_output):
    lines = checkstyle_output.splitlines()
    violation_lines = [line for line in lines if line.strip().startswith("[ERROR]")]
    results = []

    pattern = re.compile(r'\[ERROR\]\s+(.*\.java):(\d+)(?::(\d+))?:\s*(.*?)(?:\s*\[([^\]]+)\])?$')

    for line in violation_lines:
        match = pattern.match(line.strip())
        if match:
            file_path, line_num, col_num, message, check_name = match.groups()
            if not col_num:
                col_num = "0"

            if not check_name:
                check_name = "UnknownCheck"

            results.append({
                "FilePath": file_path.strip(),
                "LineNum": line_num.strip(),
                "ColNum": col_num.strip(),
                "Violation": message.strip(),
                "Check": check_name.strip()
            })
        else:
            print(f"[WARN]  Failed to parse:{line}")
    return results
# ========== write output ==========
def write_results_to_csv(results):
    fieldnames = [
        "RuleName", "RuleContent", "SubRuleName", "SubRuleContent", "Relationship",
        "Diversity", "DiversityComment", "Project", "FilePath",
        "LineNum", "ColNum", "Violation", "SupportLevel", "Explanation"
    ]
    with open(OUTPUT_CSV, "w", encoding='utf-8', newline='') as f:
        writer = csv.DictWriter(f, fieldnames=fieldnames)  # 默认逗号分隔
        writer.writeheader()
        for row in results:
            writer.writerow(row)


# ========== main ==========
def main():
    final_results = []

    for rule_dir in find_all_rules(PROJECT_ROOT):
        rule_json_path = os.path.join(rule_dir, "rules.json")
        rule_metadata = load_rule_metadata(rule_json_path)

        for sub_rule_name in os.listdir(rule_dir):
            sub_rule_path = os.path.join(rule_dir, sub_rule_name)
            if not os.path.isdir(sub_rule_path) or not sub_rule_name.startswith("SR"):
                continue

            config_path = os.path.join(sub_rule_path, "config.xml")
            explain_path = os.path.join(sub_rule_path, "explain.json")
            explain_data = load_explanation(explain_path).get(sub_rule_name, {})

            files_dir = os.path.join(sub_rule_path, "files")
            for category in CATEGORY_LABELS:
                category_path = os.path.join(files_dir, category)
                if not os.path.exists(category_path):
                    continue

                for file in os.listdir(category_path):
                    if not file.endswith(".java"):
                        continue

                    java_path = os.path.join(category_path, file)
                    checkstyle_output = run_checkstyle_on_file(config_path, java_path)

                    violations = extract_violations(checkstyle_output)
                    if 'OneEnumFile.java' in java_path:
                        print(config_path)
                        print(checkstyle_output)
                        print(violations)
                    meta = rule_metadata.get(sub_rule_name, {})
                    diversity = "positive" if "positive" in category else "negative"
                    if violations:
                        for v in violations :
                            result = {
                                "RuleName": os.path.basename(rule_dir),
                                "RuleContent": meta.get("RuleContent", ""),
                                "SubRuleName": sub_rule_name,
                                "SubRuleContent": meta.get("SubRuleContent", ""),
                                "Relationship": meta.get("Relationship", ""),
                                "Diversity": diversity,
                                "DiversityComment": "",
                                "Project": explain_data.get("Project", ""),
                                "FilePath": os.path.relpath(java_path, PROJECT_ROOT),
                                "LineNum": v.get("LineNum", ""),
                                "ColNum": v.get("ColNum", ""),
                                "Violation": v.get("Violation", "None"),
                                "SupportLevel": explain_data.get("SupportLevel", ""),
                                "Explanation": explain_data.get("Explanation", "")
                            }
                            final_results.append(result)

    write_results_to_csv(final_results)
    print(f"\n Success，save to：{OUTPUT_CSV}")

if __name__ == "__main__":
    main()
    convert_file("./checkstyle_results.csv", "./checkstyle_results.xlsx")
