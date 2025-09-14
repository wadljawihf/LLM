public class WrongBlockTagWrap {

  /**
   * Processes a long operation.
   *
   * @param input the input value used to process the operation and this description
   *continues on the next line with no indentation.
   * @return the result of processing which might span
   * multiple lines with insufficient indentation.
   * @throws IllegalStateException if some internal state
   *  is invalid during execution.
   * @deprecated Use processNewApi instead.
   *    This method will be removed in future versions.
   */
  @Deprecated
  public String process(String input) {
    if (input == null) {
      throw new IllegalStateException("Invalid input");
    }
    return input.trim();
  }
}
