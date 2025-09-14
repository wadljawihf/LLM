package com.blankj.subutil.util.positive;

public class CommaAttachToToken {
  // 数组初始化
  int[] numbers = {1, 2, 3};

  // 集合初始化
  List<String> list = Arrays.asList("a", "b", "c");



  // 方法参数
  public void printValues(String num1, String num2, int numx) {}

  // 方法调用参数
  public void callMethod() {

    printValues("hello", "world", 123);
  }



  // 泛型类型参数
  public <T, U, V> void process(T t, U u, V v) {}

  // 枚举
  enum Color {
    RED, GREEN, BLUE;
  }

  // 多值 case
  public void testSwitch(int num) {
    switch (num) {
      case 1, 2, 3 -> System.out.println("One to three");
      default -> System.out.println("Other");
    }
  }

  // 多变量声明
  void testMulti() {
    for (int i = 0, j = 10; i < j; i++, j--) {
      System.out.println(i + ", " + j);
    }
  }

}
