public class FiledAnnotationPlace {
  /** This is an important field. */
  @Deprecated
  private String oldField;

  /** Field with non-null guarantee. */
  @Nonnull
  private String name;
}
