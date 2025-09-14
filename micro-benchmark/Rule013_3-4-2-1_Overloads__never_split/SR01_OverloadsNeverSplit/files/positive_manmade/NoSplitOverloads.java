package com.positive;

/**
* Test For NoSplitOverloads.
*/
public class NoSplitOverloads {
  private int value;

  /**
   * NoSplitOverloads 1.
   */
  public NoSplitOverloads() {}

  /**
   * NoSplitOverloads 1.
   */
  public NoSplitOverloads(String name) {}

  void foo() {}

  void foo(int x) {}

  void foo(int x, int y) {}

  void foo(String y) {}


  void bar() {}

}
