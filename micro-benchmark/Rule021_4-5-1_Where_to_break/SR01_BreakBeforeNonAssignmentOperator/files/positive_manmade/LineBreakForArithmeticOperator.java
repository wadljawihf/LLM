public class LineBreakForArithmeticOperator {
  void additionTest() {
    int a = 1;
    int b = 2;

    // 前伴随换行（合法）
    int sumGood = a
        + b;

  }

  void subtractionTest() {
    int a = 5;
    int b = 3;

    // 前伴随换行（合法）
    int diffGood = a
        - b;
  }

  void multiplicationTest() {
    int a = 4;
    int b = 6;

    // 前伴随换行（合法）
    int productGood = a
        * b;

  }

  void divisionTest() {
    int a = 10;
    int b = 2;

    // 前伴随换行（合法）
    int quotientGood = a
        / b;

  }
}
