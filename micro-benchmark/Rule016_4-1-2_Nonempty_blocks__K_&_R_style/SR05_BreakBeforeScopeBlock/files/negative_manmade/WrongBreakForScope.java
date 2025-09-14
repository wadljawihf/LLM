package com.example.braces.negative;

public class WrongBreakForScope {
  void testScope() {
    {
      int temp = 111;
    } {
      int temp = 222;
    } {
      int temp = 333;
    }
  }
}
