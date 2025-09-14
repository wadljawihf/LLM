public class MultiDotIndentation {

  // 缩进+4
  String ident4() {
    use(object()
            .stepOne()
            .stepTwo()
            .stepThree()
    );
    int result = object()
        .stepOne()
        .stepTwo()
        .stepThree();

    return object()
        .stepOne()
        .stepTwo()
        .stepThree();
  }

  // 缩进+6
  String ident6() {
    use(object()
            .stepOne()
            .stepTwo()
            .stepThree()
    );
    int result = object()
        .stepOne()
        .stepTwo()
        .stepThree();

    return object()
        .stepOne()
        .stepTwo()
        .stepThree();
  }


  // Helpers
  StringBuilder object() {
    return new StringBuilder();
  }

  void use(Object o) {}
}
