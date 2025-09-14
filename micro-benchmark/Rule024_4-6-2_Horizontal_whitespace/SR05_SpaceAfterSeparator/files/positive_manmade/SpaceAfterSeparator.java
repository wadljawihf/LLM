public class SpaceAfterSeparator {
  // 逗号后有空格
  void commaExample() {
    List<String> list = Arrays.asList("a", "b", "c");
    for (int i = 0, j = 10; i < j; i++, j--) {
      System.out.println(i + ", " + j);
    }
  }

  // 冒号后有空格（增强 for）
  void colonExample() {
    label: while (true) {
      break label;
    }
  }


  // 分号后有空格（在语句内部）
  void semicolonExample() {
    for (int i = 0; i < 10; i++) {
      i = i;
    }
  }

  // 类型转换后右括号 `)` 后有空格
  void castExample() {
    Object obj = "123";
    int num = (int) obj;
    System.out.println(num);
  }

  List<String> list() {
    return List.of("a", "b", "c");
  }
}
