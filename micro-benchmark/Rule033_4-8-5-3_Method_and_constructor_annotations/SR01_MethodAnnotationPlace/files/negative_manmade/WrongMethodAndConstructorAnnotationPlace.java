public class WrongMethodAndConstructorAnnotationPlace {
  @Deprecated
  /** Constructs an example. */
  public WrongMethodAndConstructorAnnotationPlace() {
    // constructor body
  }

  @Override
  @Deprecated
  @CheckReturnValue
  /** Executes the main task. */
  public String run() {
    return "running";
  }
}
