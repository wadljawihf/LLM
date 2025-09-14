package org.antlr.v4.runtime.atn.negative;

public class ThreeStatement {
  void testEmpty() {
    ; ;
  }

  void testNonEmpty() {
    int x = 0; int y = 1; int z = 1;
  }

  void testMixed() {
    ; ; int x = 0;
    ; int y = 0; ;
    int z = 0;;;
  }
}
