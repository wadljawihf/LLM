public class TypeAnnotationSpace {

  void testArrayAnnotations() {
    @Nullable String @Readonly [] words = new String[] {"a", "b"};
    int @Marker [] numbers = new int[] {1, 2, 3};
  }

  void testVarargAnnotations(@NonNull String @Readonly ... args) {
    for (String s : args) {
      System.out.println(s);
    }
  }

  // Type annotations
  @Target({ElementType.TYPE_USE})
  @interface Readonly {}

  @Target({ElementType.TYPE_USE})
  @interface Marker {}

  @Target({ElementType.TYPE_USE})
  @interface Nullable {}

  @Target({ElementType.TYPE_USE})
  @interface NonNull {}
}
