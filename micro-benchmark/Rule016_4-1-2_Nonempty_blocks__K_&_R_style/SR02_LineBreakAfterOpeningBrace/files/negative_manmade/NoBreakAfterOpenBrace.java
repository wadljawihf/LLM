public class NoBreakAfterOpenBrace {
  NoBreakAfterOpenBrace() {}

  void func() {}

  void testIf() { if (true) {}
    if (true) { int x = 1;
    }
    if (true) { int x = 1;
      int y = 2;
    }
  }

  void testElse() { if (false) {
      int a = 0;
    } else {}
    if (false) {
      int a = 0;
    } else { int b = 1;
    }
    if (false) {
      int a = 0;
    } else { int b = 1;
      int c = 2;
    }
  }

  void testFor() { for (int i = 0; i < 1; i++) {}
    for (int i = 0; i < 1; i++) { int x = i;
    }
    for (int i = 0; i < 1; i++) { int x = i;
      int y = x + 1;
    }
  }

  void testWhile() { while (false) {}
    while (false) { int x = 0;
    }
    while (false) { int x = 0;
      int y = 1;
    }
  }

  void testDoWhile() { do {} while (false);
    do { int x = 1;
    } while (false);
    do { int x = 1;
      int y = 2;
    } while (false);
  }

  void testScope() { { int temp = 111;
    }

    { int temp = 222;
    }

    { int temp = 333;
    }
  }
}
