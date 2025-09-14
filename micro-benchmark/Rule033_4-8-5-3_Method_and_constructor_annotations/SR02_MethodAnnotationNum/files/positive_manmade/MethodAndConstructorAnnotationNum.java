public class MethodAndConstructorAnnotationNum {
  /** Constructs an example. */
  @Override
  @Deprecated
  public MethodAndConstructorAnnotationNum() {
    // constructor body
  }

  /** Executes the main task. */
  @Override
  @Deprecated
  @CheckReturnValue
  public String run() {
    return "running";
  }
}
