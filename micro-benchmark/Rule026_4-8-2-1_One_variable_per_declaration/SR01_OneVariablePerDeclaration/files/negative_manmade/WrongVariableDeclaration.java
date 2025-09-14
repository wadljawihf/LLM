public class WrongVariableDeclaration {
  int num1, num2;                    // 多变量字段声明

  void method() {
    String first = "A", second = "B";  // 多变量局部声明

    for (int i = 0, j = 10; i < j; i++) {  // for循环头可以声明多个变量
      System.out.println(i + j);
    }
  }
}
