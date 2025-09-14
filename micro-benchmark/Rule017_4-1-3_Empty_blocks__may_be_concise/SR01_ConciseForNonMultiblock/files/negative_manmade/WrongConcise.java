public class WrongConcise {

  void multiBlockExamples() {
    // if/else 中 if 空块缩写 - 不可缩写
    if (true) {} else {
      System.out.println("else");
    }

    // if/else 中 else 空块缩写 - 不可缩写
    if (false) {
      System.out.println("if");
    } else {}

    // try/catch/finally 中 try 空块缩写 - 不可缩写
    try {} catch (Exception e) {
      System.out.println("caught");
    }

    // try/catch/finally 中 catch 空块缩写 - 不可缩写
    try {
      System.out.println("try");
    } catch (Exception expected) {}

    // try/catch/finally 中 finally 空块缩写 - 不可缩写
    try {
      System.out.println("try");
    } catch (Exception e) {
      System.out.println("caught");
    } finally {}
  }
}