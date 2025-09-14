public class WrongBlockCommentStar {

  void doSomething() {
    int x = 0;
    /*
     Prepare the inputs.
     Prepare the inputs.
     Prepare the inputs.
     */
    x = 1;

    int y = 0;
    /*
     * Prepare the inputs.
        * Prepare the inputs.
 * Prepare the inputs.
     */
    y = x + 2;
  }
}
