package org.antlr.v4.runtime.atn.negative;

public class TwoStatement {
  void testEmpty() {
    ; ;
  }

  void testNonEmpty() {
    int x = 0; int y = 1;
  }

  void testMixed() {
    ; int x = 0;
    int y = 0;;
  }
}
