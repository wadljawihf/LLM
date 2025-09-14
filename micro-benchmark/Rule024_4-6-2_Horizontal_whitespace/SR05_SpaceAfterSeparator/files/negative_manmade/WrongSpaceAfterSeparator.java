public class WrongSpaceAfterSeparator {
  // 逗号后没有空格
  void commaExample() {
    List<String> list = Arrays.asList("a", "b", "c");
    for (int i = 0,j = 10; i < j; i++,j--) {
      System.out.println(i + ", " + j);
    }
  }

  // 逗号后有多个空格
  void commaExample() {
    List<String> list = Arrays.asList("a", "b", "c");
    for (int i = 0,   j = 10; i < j; i++,     j--) {
      System.out.println(i + ", " + j);
    }
  }

  // 逗号前有空格
  void commaExample() {
    List<String> list = Arrays.asList("a", "b", "c");
    for (int i = 0 ,j = 10; i < j; i++ ,j--) {
      System.out.println(i + ", " + j);
    }
  }

  // 逗号后有tab
  void commaExample() {
    List<String> list = Arrays.asList("a", "b", "c");
    for (int i = 0,	j = 10; i < j; i++,	j--) {
      System.out.println(i + ", " + j);
    }
  }

  // 冒号后没有空格
  void colonExample() {
    label:while (true) {
      break label;
    }
  }

  // 冒号后有多个空格
  void colonExample() {
    label:     while (true) {
      break label;
    }
  }

  // 冒号前有空格
  void colonExample() {
    label :while (true) {
      break label;
    }
  }


  // 冒号后有tab
  void colonExample() {
    label:	while (true) {
      break label;
    }
  }

  // 分号后没有空格
  void semicolonExample() {
    for (int i = 0;i < 10;i++) {
      i = i;
    }
  }

  // 分号后有多个空格
  void semicolonExample() {
    for (int i = 0;  i < 10;   i++) {
      i = i;
    }
  }

  // 分号前有空格
  void semicolonExample() {
    for (int i = 0 ;i < 10 ;i++) {
      i = i;
    }
  }

  // 分号后有tab
  void semicolonExample() {
    for (int i = 0;	i < 10;	i++) {
      i = i;
    }
  }

  // 类型转换后右括号 `)` 后没有空格
  void castExample() {
    Object obj = "123";
    int num = (int)obj;
    System.out.println(num);
  }

  // 类型转换后右括号 `)` 后有多个空格
  void castExample() {
    Object obj = "123";
    int num = (int)   obj;
    System.out.println(num);
  }

  // 类型转换后右括号 `)` 前有空格
  void castExample() {
    Object obj = "123";
    int num = (int)obj;
    System.out.println(num);
  }

  // 类型转换后右括号 `)` 后有tab
  void castExample() {
    Object obj = "123";
    int num = (int)	obj;
    System.out.println(num);
  }

}
