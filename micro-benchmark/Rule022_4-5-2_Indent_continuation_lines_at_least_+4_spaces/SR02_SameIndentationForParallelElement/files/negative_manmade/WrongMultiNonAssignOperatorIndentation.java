public class WrongMultiNonAssignOperatorIndentation {

  // 混合缩进
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

  // 混合缩进
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

