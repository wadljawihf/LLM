public class BlockTagOrder {
  /**
   * Performs division of two integers.
   *
   * <p>This method returns the quotient of a and b.
   *
   * @param a the numerator
   * @param b the denominator
   * @return the integer division result
   * @throws ArithmeticException if b is zero
   * @deprecated This method is deprecated. Use divideSafely instead.
   */
  @Deprecated
  int divide(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException("Divide by zero");
    }
    return a / b;
  }

}

