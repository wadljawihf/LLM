class IllegalUnicode {
  void test() {
    int a = 1;
    int b = 2;
    // 实际是 a + b
    int sum = \u0061 + \u0062;
    System.out.println(sum);
  }
}
