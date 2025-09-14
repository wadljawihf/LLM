class NonAscii {
  void main(String[] args) {
    String infinity = "∞"; // 使用真实 Unicode 字符 U+221E
    System.out.println("Value is: " + infinity);
    String infinity = "\u221E"; // 使用 Unicode 转义表示 ∞
    System.out.println("Value is: " + infinity);
  }
}
