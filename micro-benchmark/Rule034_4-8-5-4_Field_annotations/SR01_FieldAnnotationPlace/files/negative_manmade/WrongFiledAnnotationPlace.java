public class WrongFiledAnnotationPlace {
  @Deprecated
  /** This is an important field. */  // 注解不应该在注释之前
  private String oldField;

  @Nonnull
  /** Field with non-null guarantee. */ // 注解不应该在注释之前
  private String name;
}
