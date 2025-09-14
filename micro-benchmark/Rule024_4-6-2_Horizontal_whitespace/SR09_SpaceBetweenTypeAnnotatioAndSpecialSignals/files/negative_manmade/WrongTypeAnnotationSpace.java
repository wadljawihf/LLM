public class WrongTypeAnnotationSpace {

  void testArrayAnnotations() {
    // 没有空格
    @Nullable String @Readonly[] words = new String[] {"a", "b"};

    // 多个空格
    int @Marker   [] numbers = new int[] {1, 2, 3};

    // tab
    int @Marker	[] numbers = new int[] {1, 2, 3};

    // 换行
    double @Readonly
        [] values = new double[] {1.0, 2.0};
  }

  void testVarargAnnotations1(@NonNull String @Readonly... args1) {
      // 没有空格
      // do nothing
  }

  void testVarargAnnotations2(@NonNull String @Readonly     ... args1) {
    // 多个空格
    // do nothing
  }

  void testVarargAnnotations3(@NonNull String @Readonly	... args1) {
    // tab
    // do nothing
  }

  void testVarargAnnotations4(@NonNull String @Readonly
      ... args1) {
    // 换行
    // do nothing
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
