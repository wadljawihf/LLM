public class VariableDeclaration {
  String name;              // 单变量声明

  void method() {
    double pi = 3.14;       // 单变量局部声明
    boolean flag = true;    // 单变量局部声明

    for (int i = 0; i < 100; i++) {  // for循环头可以声明多个变量
      System.out.println(i);
    }
    for (int i = 0, j = 10; i < j; i++) {  // for循环头可以声明多个变量
      System.out.println(i + j);
    }
  }
}
