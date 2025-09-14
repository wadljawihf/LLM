public class WrongSpaceAroundOperator {

  // 算术运算符（无空格+多空格）
  int arithmetic(int a, int b, int c) {
    return a+b-c*2  /  4;
  }

  // 逻辑运算符（无空格+多空格）
  boolean logical(boolean x, boolean y, boolean z) {
    return x   &&   y||z;
  }



  // 三元运算符（无空格 + 多空格）
  String ternary(int n) {
    return n>0 ?  "positive":"non-positive";
  }

  // 类型边界中的 &（无空格）
  static class Generic<T extends Runnable&Comparable<T>> {
  }

  // 类型边界中的 &（多空格）
  static class Generic<T extends Runnable   &  Comparable<T>> {
  }

  // 多异常捕获 |（无空格）
  void multiCatch1() {
    try {
      int x = 1 / 0;
    } catch (ArithmeticException|NullPointerException e) {
      System.out.println("Caught: " + e);
    }
  }

  // 多异常捕获 |（多空格）
  void multiCatch2() {
    try {
      int x = 1 / 0;
    } catch (ArithmeticException  |   NullPointerException e) {
      System.out.println("Caught: " + e);
    }
  }

  // foreach 冒号（无空格 + 多空格）
  void enhancedFor(List<String> items) {
    for (String item:items) {
      System.out.println(item);
    }
    for (String item  :items) {
      System.out.println(item);
    }
  }

  // Lambda 箭头 ->（无空格）
  Function<String, Integer> lambda() {
    return s->s.length();
  }

  // Lambda 箭头 ->（多空格）
  Function<String, Integer> lambda() {
    return s->  s.length();
  }

  // switch 箭头 ->（无空格 + 多空格）
  void switchRule(int day) {
    switch (day) {
      case 1  ->  System.out.println("Monday");
      case 2->System.out.println("Tuesday");
    }
  }

  // 方法引用 ::（应无空格）
  void methodRef(List<String> list) {
    list.forEach(System.out :: println);
  }

  // 点操作符 .（应无空格）
  void dotOperator() {
    System . out . println("Done.");
  }
}
