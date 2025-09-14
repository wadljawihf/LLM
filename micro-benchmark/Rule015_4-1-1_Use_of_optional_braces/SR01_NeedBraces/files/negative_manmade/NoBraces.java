public class NoBraces {

  void testIf() {
    if (true);

  }

  void testElse() {
    if (false) {
      int a = 0;
    } else ;

  }

  void testFor() {
    for (int i = 0; i < 1; i++);

  }

  void testWhile() {
    while (false);

  }

  void testDoWhile() {
    do ; while (false);

  }
}