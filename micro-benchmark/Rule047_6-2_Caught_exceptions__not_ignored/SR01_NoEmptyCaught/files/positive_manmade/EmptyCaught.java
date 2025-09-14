public class EmptyCaught {
  public void example() {
    try {
      int x = 1 / 0;
    } catch (ArithmeticException e) {
      // This is safe to ignore because x is never zero in production.
    }

    try {
      closeResource();
    } catch (Exception e) {
      // Intentionally ignored: best effort close.
    }
  }

  private void closeResource() throws Exception {
    // mock resource
  }
}
