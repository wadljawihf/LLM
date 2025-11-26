# Replication of the Paper
The replication package,and Appendix of the paper are in this repository.

## 1-micro-benchmark
### Introduction
The `micro-benchmark` directory contains a collection of 55 rules derived from the Google Java Style Guide.
These rules have been decomposed into 103 fine-grained sub-rules, with each sub-rule paired with its test files and `config.xml` to facilitate precise and reproducible evaluation.

The code for running Checkstyle and prompting the LLMs if available in `src/checkstyle_main.py` and `src/llm_main.py`.
The Checkstyle version used is [checkstyle-10.26.1](https://github.com/checkstyle/checkstyle/releases/tag/checkstyle-10.26.1) 
and Google Java Style Guide version is before [google-style](https://github.com/google/styleguide/commit/48401665ae2e31ad86609fce6ccaa8d37d25f335).

### Components
The complete benchmark consists of two core components:
1. Ground Truth Annotation File: A single Excel file, `benchmark_one_by_one_full.xlsx`, that provides manually annotated violation data for every sub-rule and test file.
2. Structured Directory of Rules and Sub-Rules: Hierarchically organized folders containing rules, sub-rules, and their associated test files.


```
📁 micro-benchmark/
 ├──📄 benchmark_one_by_one_full.xlsx
 ├── 📁 RuleXXX_<rule-name>/
 │    ├── 📄 rules.json
 │    └── 📁 SR01_<sub-rule-name>/
 │    │    ├── 📄 config.xml
 │    │    ├── 📄 explain.json
 │    │    └── 📁 files/
 │    └── 📁 SR02_<sub-rule-name>/
 │         ├── 📄 config.xml
 │         ├── 📄 explain.json
 │         └── 📁 files/
 │
 ├── 📁 RuleYYY_<rule-name>/
 │    ├── 📄 rules.json
 │    └── 📁 SR01_<sub-rule-name>/
 │         ├── 📄 config.xml
 │         ├── 📄 explain.json
 │         └── 📁 files/
 │
 └── ...
 
```

## 2-metrics.zip
The file `metrics.zip` includes:
* checkstyle result:
  * `checkstyle_metrics_sub_rule.xlsx`
* deepseek result:
  * `deepseek_metrics_sub_rule_1.xlsx`
  * `deepseek_metrics_sub_rule_2.xlsx`
  * `deepseek_metrics_sub_rule_3.xlsx`
  * `deepseek_metrics_sub_rule_4.xlsx`
  * `deepseek_metrics_sub_rule_5.xlsx`
* gemini result:
  * `gemini_metrics_sub_rule_1.xlsx`
  * `gemini_metrics_sub_rule_2.xlsx`
  * `gemini_metrics_sub_rule_3.xlsx`
  * `gemini_metrics_sub_rule_4.xlsx`
  * `gemini_metrics_sub_rule_5.xlsx`
* gpt result:
  * `gpt_metrics_sub_rule_1.xlsx`
  * `gpt_metrics_sub_rule_2.xlsx`
  * `gpt_metrics_sub_rule_3.xlsx`
  * `gpt_metrics_sub_rule_4.xlsx`
  * `gpt_metrics_sub_rule_5.xlsx`

 ## 3-Appendix.pdf
 The file `Appendix.pdf` shows the Appendix of the paper "Large Language Models for Code Linting: How Far Are We?".

