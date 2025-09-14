public class SpaceAroundOperator {

  // 算术运算符
  int arithmetic(int a, int b, int c) {
    return a + b - c * 2 / 4;
  }

  // 逻辑运算符
  boolean logical(boolean x, boolean y, boolean z) {
    return x && y || z;
  }

  // 比较运算符
  boolean comparison(int a, int b, int c) {
    return a != b && b >= c || a < c;
  }

  // 三元运算符
  String ternary(int n) {
    return n > 0 ? "positive" : "non-positive";
  }

  // 类型边界中的 &
  static class Generic<T extends Runnable & Comparable<T>> {
  }

  // 多异常捕获中的 |
  void multiCatch() {
    try {
      int x = 1 / 0;
    } catch (ArithmeticException | NullPointerException e) {
      System.out.println("Caught: " + e);
    }
  }

  // foreach 中的冒号
  void enhancedFor(List<String> items) {
    for (String item : items) {
      System.out.println(item);
    }
  }

  // Lambda 表达式中的 ->
  Function<String, Integer> lambda() {
    return s -> s.length();
  }

  // switch rule 中的 ->
  void switchRule(int day) {
    switch (day) {
      case 1 -> System.out.println("Monday");
      case 2 -> System.out.println("Tuesday");
      default -> System.out.println("Other");
    }
  }

  // 特例：方法引用 ::（不加空格）
  void methodRef(List<String> list) {
    list.forEach(System.out::println);
  }

  // 特例：点操作符 .（不加空格）
  void dotOperator() {
    System.out.println("Done.");
  }
}
