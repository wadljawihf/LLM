public class LineBreakForComparisonOperator {
  void equalOperatorCompliant() {
    int x = 5;
    int y = 5;

    if (x
        == y) {
      System.out.println("x equals y");
    }
  }

  void notEqualOperatorCompliant() {
    int x = 5;
    int y = 10;

    if (x
        != y) {
      System.out.println("x not equal to y");
    }
  }

  void lessThanOperatorCompliant() {
    int a = 3;
    int b = 7;

    if (a
        < b) {
      System.out.println("a is less than b");
    }
  }

  void greaterThanOperatorCompliant() {
    int a = 9;
    int b = 4;

    if (a
        > b) {
      System.out.println("a is greater than b");
    }
  }
}
