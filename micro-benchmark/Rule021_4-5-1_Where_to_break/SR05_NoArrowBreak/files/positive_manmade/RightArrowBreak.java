class RightArrowBreak {
  void test() {
    MyLambda <String, Long, Object> lambda =
        (String label, Long value, Object obj) -> {
          longExpressionInvolving(label);
    };

    Predicate < String > predicate = str ->
        longExpressionInvolving(str);

    switch (x) {
      case ColorPoint(Color color, Point(int x, int y)) ->
          handleColorPoint(color, x, y);
    }
  }
}