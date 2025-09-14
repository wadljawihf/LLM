public class WrongAssignOperatorIndentation {

  // 增加缩进 = 0
  int assignEqual(int a, int b) {
    process(a
    = b);

    int x = 0;
    x
    = b;

    return x
    = b;
  }

  // 增加缩进 = 2
  int assignPlus(int a, int b) {
    process(a
      += b);

    int x = 0;
    x
      += b;

    return x
      += b;
  }

  // 增加缩进 = 3
  int assignMixed(int a, int b, int c) {
    process(a
       *= b);
    process(a
       /= c);
    process(a
       %= 10);

    a
       *= b;
    a
       /= c;
    a
       %= 10;

    return a
       *= b;
  }

  void process(int x) {}
}
