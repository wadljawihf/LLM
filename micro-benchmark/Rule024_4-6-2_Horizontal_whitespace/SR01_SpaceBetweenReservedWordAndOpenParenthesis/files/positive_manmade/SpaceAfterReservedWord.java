public class SpaceAfterReservedWord {

  void testIf(int x) {
    if (x > 0) {
      System.out.println("Positive");
    }
  }

  void testFor() {
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
  }

  void testWhile() {
    int x = 3;
    while (x > 0) {
      x--;
    }
  }

  void testSwitch(int day) {
    switch (day) {
      case 1 -> System.out.println("Monday");
      case 2 -> System.out.println("Tuesday");
      default -> System.out.println("Other");
    }
  }

  void testTryCatch() {
    try {
      int x = 1 / 0;
    } catch (ArithmeticException e) {
      System.out.println("Divide by zero");
    }
  }

  void testSynchronized() {
    Object lock = new Object();
    synchronized (lock) {
      System.out.println("In sync block");
    }
  }

  void testAssert(int x) {
    assert (x > 0);
    System.out.println("Assert passed");
  }
}
