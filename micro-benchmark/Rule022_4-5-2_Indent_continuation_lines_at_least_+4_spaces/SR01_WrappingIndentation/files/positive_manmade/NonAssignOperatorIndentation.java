// File: NonAssignOperatorIndentation.java

public class NonAssignOperatorIndentation {

  // 使用缩进 = 4
  boolean checkLogic(boolean a, boolean b, boolean c) {
    return a
        && b
        || c;
  }

  // 使用缩进 = 6
  private int computeArithmetic(int x, int y, int z) {
    return x
        + y
        - z
        * 2
        / 4
        % 3;
  }

  // 使用缩进 = 8
  int compareValues(int a, int b, int c) {
    return a
        < b
        && b
        >= c
        || a
        != c;
  }

  // 使用混合：前两行为 4，后两行为 6
  private int bitwiseOps(int a, int b, int c) {
    return a
        & b
        | c
        ^ 0x0F;
  }
}
