public class AssignOperatorIndentation {

  // 使用缩进 = 4
  int assignEqual(int a, int b) {
    process(a
        = b);

    int x = 0;
    x
        = b;

    return x
        = b;
  }

  // 使用缩进 = 6
  int assignPlus(int a, int b) {
    process(a
          += b);

    int x = 0;
    x
          += b;

    return x
          += b;
  }

  // 使用缩进 = 8
  int assignMixed(int a, int b, int c) {
    process(a
            *= b);
    process(a
            /= c);
    process(a
            %= 10);


    return a
            *= b;
  }

  void process(int x) {}
}
