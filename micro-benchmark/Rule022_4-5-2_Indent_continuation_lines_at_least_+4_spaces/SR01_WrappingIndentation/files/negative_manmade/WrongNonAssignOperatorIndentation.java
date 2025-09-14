public class WrongNonAssignOperatorIndentation {
  // 增加缩进 = 2
  boolean checkLogic(boolean a, boolean b, boolean c) {
    process(a
      && b
      || c
    );
    boolean result = a
      && b
      || c;

    return a
      && b
      || c;
  }

  // 增加缩进 = 3
  int computeArithmetic(int x, int y, int z) {
    process(x
       + y
       - z
       * 2
       / 4
       % 3
    );

    int result = x
       + y
       - z
       * 2
       / 4
       % 3;

    return x
       + y
       - z
       * 2
       / 4
       % 3;
  }


  // 增加缩进 = 0
  int compareValues(int a, int b, int c) {
    process(a
    < b
    && b
    >= c
    || a
    != c
    );

    boolean result = a
    < b
    && b
    >= c
    || a
    != c;

    return a
    < b
    && b
    >= c
    || a
    != c;
  }

}

