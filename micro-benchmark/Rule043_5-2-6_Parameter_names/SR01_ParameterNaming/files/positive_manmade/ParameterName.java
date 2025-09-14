public class ParameterName {
  // ASCII, 小驼峰
  void processData(String inputData, int userCount) {}

  // 特例：允许数字间下划线
  void loadVersion(String guava33_4_6) {}

  // 处理了非ASCII字符：Mueller
  void runMuellersAlgorithm(String muellersAlgorithm) {}

  // 去除撇号后的小驼峰
  void handleAlgorithm(String muellersAlgorithmV2) {}
}
