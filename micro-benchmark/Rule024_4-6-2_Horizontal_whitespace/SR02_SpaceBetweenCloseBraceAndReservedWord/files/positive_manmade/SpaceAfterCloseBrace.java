// File: SpaceAfterCloseBrace.java

public class SpaceAfterCloseBrace {

  void testIfElse(int x) {
    if (x > 0) {
      System.out.println("Positive");
    } else {
      System.out.println("Non-positive");
    }
  }

  void testTryCatch() {
    try {
      int y = 1 / 0;
    } catch (ArithmeticException e) {
      System.out.println("Divided by zero");
    }
  }
}
