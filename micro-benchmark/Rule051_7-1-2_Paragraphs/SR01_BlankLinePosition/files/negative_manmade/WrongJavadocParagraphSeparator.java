public class WrongJavadocParagraphSeparator {
  /**
   * Performs a critical operation on the given values.
   * This method demonstrates how to structure complex logic in a
   * clear and readable format, adhering to documentation standards.
   * @param a the first input value
   * @param b the second input value
   * @return the result of the operation
   */
  int compute(int a, int b) {
    return a + b;
  }

  /**
   * Performs a critical operation on the given values.
   * <p>This method demonstrates how to structure complex logic in a
   * clear and readable format, adhering to documentation standards.
   * @param a the first input value
   * @param b the second input value
   * @return the result of the operation
   */
  int sum(int a, int b) {
    return a + b;
  }


  /**
   * Performs a critical operation on the given values.
   *
   * <p>This method demonstrates how to structure complex logic in a
   * clear and readable format, adhering to documentation standards.
   * <p>This method demonstrates how to structure complex logic in a
   * clear and readable format, adhering to documentation standards.
   *
   * @param a the first input value
   * @param b the second input value
   * @return the result of the operation
   */
  int sub(int a, int b) {
    return a - b;
  }



}
