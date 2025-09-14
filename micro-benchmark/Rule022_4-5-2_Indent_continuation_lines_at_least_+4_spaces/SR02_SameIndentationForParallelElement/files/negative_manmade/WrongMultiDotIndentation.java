public class WrongMultiDotIndentation {

  // 混合缩进
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

  // 混合缩进
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
