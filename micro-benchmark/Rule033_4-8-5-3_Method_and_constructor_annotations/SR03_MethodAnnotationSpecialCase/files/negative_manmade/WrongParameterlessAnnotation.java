public class WrongParameterlessAnnotation {
  /** 不允许将多个注解与签名同行. */
  @Override @Deprecated public WrongParameterlessAnnotation() {
    // constructor body
  }

  /** 带参数的注解不能同行. */
  @SuppressWarnings("unused") public void f3() {}
}
