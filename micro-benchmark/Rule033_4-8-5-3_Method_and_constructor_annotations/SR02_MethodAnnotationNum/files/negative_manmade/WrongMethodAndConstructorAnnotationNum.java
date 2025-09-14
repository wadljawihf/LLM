public class WrongMethodAndConstructorAnnotationNum {
  /** Constructs an example. */
  @Override @Deprecated
  public WrongMethodAndConstructorAnnotation() {
    // constructor body
  }

  /** Executes the main task. */
  @Override
  @Deprecated @CheckReturnValue
  public String run() {
    return "running";
  }
}
