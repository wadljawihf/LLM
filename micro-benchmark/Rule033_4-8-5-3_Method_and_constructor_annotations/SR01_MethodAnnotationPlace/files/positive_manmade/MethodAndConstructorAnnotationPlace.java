public class MethodAndConstructorAnnotationPlace {
  /** Constructs an example. */
  @Deprecated
  public MethodAndConstructorAnnotationPlace() {
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
