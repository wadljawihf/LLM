package com.blankj.subutil.util.negative;

public class WrongLineBreakForTypeBoundOperator {
  // 类型边界中的 & 后换行（违规）
  class MultiBoundGeneric1<T extends Runnable &
      AutoCloseable> {
  }

  class MultiBoundGeneric2<T extends java.io.Serializable &
      Comparable<T>> {
  }

  public <T extends Number &
      Comparable<T>> void process(T value) {
    System.out.println("Processing: " + value);
  }
}
