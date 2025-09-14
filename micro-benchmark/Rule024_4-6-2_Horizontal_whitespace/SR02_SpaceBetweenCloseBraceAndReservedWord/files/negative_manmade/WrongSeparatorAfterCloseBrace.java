public class WrongSeparatorAfterCloseBrace {

  void testIfElse(int x) {
    // 没有间隔
    if (x > 0) {
      System.out.println("Positive");
    }else {
      System.out.println("Non-positive");
    }

    // 多个空格
    if (x > 0) {
      System.out.println("Positive");
    }   else {
      System.out.println("Non-positive");
    }

    // 换行
    if (x > 0) {
      System.out.println("Positive");
    }
    else {
      System.out.println("Non-positive");
    }

    // tab
    if (x > 0) {
      System.out.println("Positive");
    }	else {
      System.out.println("Non-positive");
    }

  }

  void testTryCatch() {
    // 没有间隔
    try {
      int y = 1 / 0;
    }catch (ArithmeticException e) {
      System.out.println("Divided by zero");
    }

    // 多个空格
    try {
      int y = 1 / 0;
    }   catch (ArithmeticException e) {
      System.out.println("Divided by zero");
    }

    // 换行
    try {
      int y = 1 / 0;
    }
    catch (ArithmeticException e) {
      System.out.println("Divided by zero");
    }

    // tab
    try {
      int y = 1 / 0;
    }	catch (ArithmeticException e) {
      System.out.println("Divided by zero");
    }
  }
}
