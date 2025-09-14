package negative;

public class WrongBlockCommentIndentation {

  void doSomething() {
    int x = 0;
      /*
       * Prepare the inputs.
       */
    x = 1;

    int y = 0;
  /*
   * Perform the operation.
   */
    y = x + 2;
  }
}
