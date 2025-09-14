package com.negative;

/**
* Test For NoSplitOverloads.
*/
public class SplitOverloads {
  private int value;

  /**
   * NoSplitOverloads 1.
   */
  public SplitOverloads() {}

  /**
   * NoSplitOverloads 1.
   */
  public SplitOverloads(String name) {}

  void foo() {}

  void bar1() {}

  void foo(int x) {}

  void foo(int x, int y) {}

  void bar2() {}

  void foo(String y) {}




}
