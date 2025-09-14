package com.blankj.subutil.util.negative;

import java.util.Arrays;
import java.util.List;

public class WrongBreakForMethodAccessOperator {
  void dotOperatorCompliant() {
    String text = "hello";

    // 点运算符后换行
    String result = text.
        toUpperCase();

    List<String> items = Arrays
        .asList("a", "b", "c");

    int size = items
        .size();
  }

  void methodReferenceCompliant() {
    List<String> items = Arrays.asList("a", "b");

    // 方法引用 :: 后换行
    items.stream()
        .map(String::toUpperCase)
        .forEach(System.out::
            println);
  }
}
