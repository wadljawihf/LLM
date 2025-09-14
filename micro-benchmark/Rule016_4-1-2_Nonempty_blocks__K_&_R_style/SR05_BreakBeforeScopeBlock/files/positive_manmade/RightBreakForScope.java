package com.example.braces.positive;

public class RightBreakForScope {
  void testScope() {
    {
      int temp = 111;
    }

    {
      int temp = 222;
    }

    {
      int temp = 333;
    }
  }
}
