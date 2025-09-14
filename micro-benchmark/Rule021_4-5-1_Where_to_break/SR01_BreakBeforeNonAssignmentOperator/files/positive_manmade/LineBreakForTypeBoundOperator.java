package com.blankj.subutil.util.positive;

import java.util.Arrays;
import java.util.List;

public class LineBreakForTypeBoundOperator {
  // 类型边界中的 & 前换行（合法）
  class MultiBoundGeneric1<T extends Runnable
      & AutoCloseable> {
  }

  class MultiBoundGeneric2<T extends java.io.Serializable
      & Comparable<T>> {
  }

  public <T extends Number
      & Comparable<T>> void process(T value) {
    System.out.println("Processing: " + value);
  }
}
