public class ParameterlessAnnotation {
  /** Standard override. */
  @Override
  public ParameterlessAnnotation() {
    // constructor body
  }

  /** 允许将单个注解与签名同行. */
  @Override public ParameterlessAnnotation() {
    // constructor body
  }

  /** Standard override. */
  @Override
  public String toString() {
    return "example";
  }

  @Override
  @Deprecated public String toString(String str) {
    return "example";
  }

  /** 允许将单个注解与签名同行. */
  @Override public int hashCode() {
    return 42;
  }


}
