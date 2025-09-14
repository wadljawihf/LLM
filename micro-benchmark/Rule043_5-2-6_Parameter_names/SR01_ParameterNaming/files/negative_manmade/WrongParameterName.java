package org.jkiss.dbeaver.ext.altibase.model.negative;

public class WrongParameterName {
  // PascalCase
  void processData(String InputData) {}

  // 全小写单词 + 下划线连接（非数字）
  void handleData(String input_data_value) {}


  // 非ASCII字符
  void runMuellersAlgorithm(String MüllersAlgorithm) {}

  // 含撇号（非法字符）
  void runAlgorithm(String muller’sAlgorithm) {}


  // 多个下划线之间连接非数字词
  void doProcess(String error__rate) {}
}
