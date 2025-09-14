public class MultiNonAssignOperatorIndentation {

  // 使用缩进 = 4
  boolean checkLogic(boolean a, boolean b, boolean c) {
    process(a
        || b
        || c
    );
    boolean result = a
        || b
        || c;

    return a
        || b
        || c;
  }

  // 使用缩进 = 6
  int computeArithmetic(int x, int y, int z) {
    process(x
          + y
          + z
          + 2
          + 4
          + 3
    );

    int result = x
          + y
          + z
          + 2
          + 4
          + 3;

    return x
          + y
          + z
          + 2
          + 4
          + 3;
  }



}

