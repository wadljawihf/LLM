package org.antlr.mojo.antlr4.negative;

public class WrongSeparatorAfterReservedWord {

  void testIf(int x) {
    // 没有间隔
    if(x > 0) {
      System.out.println("Positive");
    }

    // 多个空格
    if   (x > 0) {
      System.out.println("Positive");
    }

    // 换行
    if
        (x > 0) {
      System.out.println("Positive");
    }

    // tab
    if	(x > 0) {
      System.out.println("Positive");
    }
  }

  void testFor() {
    // 没有间隔
    for(int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    // 多个空格
    for   (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    // 换行
    for
        (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    // tab
    for	(int i = 0; i < 5; i++) {
      System.out.println(i);
    }
  }

  void testWhile() {
    int x = 3;
    // 没有间隔
    while(x > 0) {
      x--;
    }

    // 多个空格
    while   (x > 0) {
      x--;
    }

    // 换行
    while
        (x > 0) {
      x--;
    }

    // tab
    while	(x > 0) {
      x--;
    }
  }

  void testSwitch(int day) {
    // 没有间隔
    switch(day) {
      case 1 -> System.out.println("Monday");
      case 2 -> System.out.println("Tuesday");
      default -> System.out.println("Other");
    }

    // 多个空格
    switch   (day) {
      case 1 -> System.out.println("Monday");
      case 2 -> System.out.println("Tuesday");
      default -> System.out.println("Other");
    }

    // 换行
    switch
        (day) {
      case 1 -> System.out.println("Monday");
      case 2 -> System.out.println("Tuesday");
      default -> System.out.println("Other");
    }

    // tab
    switch	(day) {
      case 1 -> System.out.println("Monday");
      case 2 -> System.out.println("Tuesday");
      default -> System.out.println("Other");
    }
  }

  void testTryCatch() {
    // 没有间隔
    try {
      int x = 1 / 0;
    } catch(ArithmeticException e) {
      System.out.println("Divide by zero");
    }

    // 多个空格
    try {
      int x = 1 / 0;
    } catch   (ArithmeticException e) {
      System.out.println("Divide by zero");
    }

    // 换行
    try {
      int x = 1 / 0;
    } catch
        (ArithmeticException e) {
      System.out.println("Divide by zero");
    }

    // tab
    try {
      int x = 1 / 0;
    } catch	(ArithmeticException e) {
      System.out.println("Divide by zero");
    }
  }

  void testSynchronized() {
    Object lock = new Object();
    // 没有间隔
    synchronized(lock) {
      System.out.println("In sync block");
    }

    // 多个空格
    synchronized   (lock) {
      System.out.println("In sync block");
    }

    // 换行
    synchronized
        (lock) {
      System.out.println("In sync block");
    }

    // tab
    synchronized	(lock) {
      System.out.println("In sync block");
    }
  }

  void testAssert(int x) {
    // 没有间隔
    assert(x > 0);

    // 多个空格
    assert   (x > 0);

    // 换行
    assert
        (x > 0);

    // tab
    assert	(x > 0);
    System.out.println("Assert passed");
  }
}
