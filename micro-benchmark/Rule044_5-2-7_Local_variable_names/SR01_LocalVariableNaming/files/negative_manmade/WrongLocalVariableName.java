public class WrongLocalVariableName {

  public void handle() {

    // PascalCase
    int UserCount = 42;

    // 全小写单词 + 下划线连接（非数字）
    String input_value = "data";


    // 非ASCII字符
    String MüllersAlgorithm = "nonASCII";

    // 含撇号
    String muller’sIdea = "invalid";

    // 全大写，误用 UPPER_SNAKE_CASE
    final String CONSTANT_LIKE = "but local";


    // 多下划线连接非数字词
    String error__rate = "too many underscores";

    // 不符合驼峰拼写结构
    String input_data_value = "snake style";
  }
}
