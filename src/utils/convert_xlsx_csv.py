'''
csv2xlsx and xlsx2csv


'''

import pandas as pd
import os

def read_file_as_text_df(file_path):
    ext = os.path.splitext(file_path)[-1].lower()

    if ext == ".csv":
        df = pd.read_csv(file_path, keep_default_na=False)
    elif ext == ".xlsx":
        df = pd.read_excel(file_path, keep_default_na=False)
    else:
        raise ValueError("File format not supported. Only .csv or .xlsx files are allowed.")

    df = df.apply(lambda col: col.map(lambda x: str(x) if pd.notna(x) else ""))
    return df


def convert_file(input_path, output_path):
    df = read_file_as_text_df(input_path)

    if output_path.lower().endswith(".csv"):
        df.to_csv(output_path, index=False, encoding="utf-8-sig", quoting=1)  # quoting=1: quote all fields
    elif output_path.lower().endswith(".xlsx"):
        df.to_excel(output_path, index=False)
    else:
        raise ValueError("Output file must be .csv or .xlsx")

    print(f"Conversion completed: {output_path}")

if __name__ == "__main__":
    input_file = r"../checkstyle_results.csv"
    output_file = r"../checkstyle_results.xlsx"
    convert_file(input_file, output_file)
