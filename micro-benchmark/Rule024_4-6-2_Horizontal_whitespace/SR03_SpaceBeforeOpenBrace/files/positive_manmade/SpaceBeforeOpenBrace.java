public class SpaceBeforeOpenBrace {  // class body 前有空格

  // 构造器体前有空格
  public SpaceBeforeOpenBrace() {
    System.out.println("Constructor");
  }

  // 方法体前有空格
  void sayHello() {
    System.out.println("Hello");
  }

  // 控制语句块前有空格
  void check(int x) {
    if (x > 0) {
      System.out.println("Positive");
    } else if (x < 0) {
      System.out.println("Negative");
    } else {
      System.out.println("Zero");
    }

    for (int i = 0; i < x; i++) {
      System.out.println(i);
    }

    while (x > 0) {
      x--;
    }

    do {
      x++;
    } while (x < 10);
  }

  // 普通匿名块
  void anonymousBlock() {
    {
      int x = 42;
    }
  }

  // 特例 1：注解数组初始化无空格
  @CustomAnno({1, 2})
  int value;

  // 特例 2：双层数组初始化无空格
  String[][] matrix = {{"a", "b"}, {"c", "d"}};
}
