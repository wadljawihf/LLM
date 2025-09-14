public class JavadocForm {

  /** Returns the current count. */
  public int getCount() {
    return 42;
  }

  /**
   * Adds two numbers.
   *
   * @param a the first number
   * @param b the second number
   * @return the result of addition
   */
  int add(int a, int b) {
    return a + b;
  }

  /**
   * Performs division.
   *
   * @param a dividend
   * @param b divisor
   * @return quotient
   */
  int divide(int a, int b) {
    return a / b;
  }

  /**
   * Multiple lines of Javadoc text are written here,
   * wrapped normally...
   */
  int longDoc() {
    return 0;
  }
}
