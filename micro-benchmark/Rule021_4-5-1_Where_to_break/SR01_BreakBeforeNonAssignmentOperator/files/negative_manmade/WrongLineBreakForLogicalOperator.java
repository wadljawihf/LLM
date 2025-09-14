package com.blankj.subutil.util.negative;

public class WrongLineBreakForLogicalOperator {
  void andOperatorCompliant() {
    boolean a = true;
    boolean b = false;

    if (a &&
        b) {
      System.out.println("Both true");
    }
  }

  void orOperatorCompliant() {
    boolean a = false;
    boolean b = true;

    if (a ||
        b) {
      System.out.println("At least one is true");
    }
  }
}
