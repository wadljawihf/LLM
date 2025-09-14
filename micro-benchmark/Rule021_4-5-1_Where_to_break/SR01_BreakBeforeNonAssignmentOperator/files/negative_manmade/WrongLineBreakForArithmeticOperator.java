public class WrongLineBreakForArithmeticOperator {
  void additionTest() {
    int a = 1;
    int b = 2;


    // 后伴随换行（违规）
    int sumBad = a +
        b;
  }

  void subtractionTest() {
    int a = 5;
    int b = 3;


    // 后伴随换行（违规）
    int diffBad = a -
        b;
  }

  void multiplicationTest() {
    int a = 4;
    int b = 6;



    // 后伴随换行（违规）
    int productBad = a *
        b;
  }

  void divisionTest() {
    int a = 10;
    int b = 2;

    // 后伴随换行（违规）
    int quotientBad = a /
        b;
  }
}
