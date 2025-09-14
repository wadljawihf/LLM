package org.antlr.mojo.antlr4.negative;

public class WrongBlockTagOrder {
  /**
   * Performs division of two integers.
   *
   * <p>This method returns the quotient of a and b.
   *
   * @deprecated This method is deprecated. Use divideSafely instead.
   * @return the integer division result
   * @param a the numerator
   * @param b the denominator
   * @throws ArithmeticException if b is zero
   */
  @Deprecated
  int divide(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException("Divide by zero");
    }
    return a / b;
  }

}

