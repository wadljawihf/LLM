public class CommaIndentation {
  // 使用缩进 = 4
  int indent4(int a,
      int b,
      int c) {
    process(
        a,
        b,
        c
    );

    int sum = sum(
        1,
        2,
        3
    );

    return sum(
        1,
        2,
        3
    );

  }

  int indent6(int a,
        int b,
        int c) {
    process(
          a,
          b,
          c
    );

    int sum = sum(
          1,
          2,
          3
    );

    return sum(
          1,
          2,
          3
    );

  }

  void process(int x, int y, int z) {}

  int sum(int a, int b, int c) {
    return a + b + c;
  }
}
