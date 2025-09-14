public class WrongJavadocForm {

  /** Returns the current count.
   * @return count
   */
  public int getCount() {
    return 42;
  }

  /** @return count */
  int oneLine() {
    return 1;
  }

  /**
   Adds two numbers.
   @param a the first number
   @param b the second number
   @return the result of addition
   */
  int add(int a, int b) {
    return a + b;
  }

  /** Performs division.
   @param a dividend
   @param b divisor
   @return quotient
   */
  int divide(int a, int b) {
    return a / b;
  }
}
