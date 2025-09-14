public class WrongSwitchFallThrough {

  void test(int input) {
    switch (input) {
      // 单语句组
      case 1:
        System.out.println("First");
        // 缺失相关注释
      case 2:
        System.out.println("One or Two");
        break;
    }

    switch (input) {
      //多语句组
      case 1, 2:
      case 3:
      case 4:
        System.out.println("Three or Four");
        // 缺失相关注释
      case 5:
      case 6, 7:
        System.out.println("One/Tow/Three/Four/Five/Six/Seven");
        break;
    }

    switch (input) {
      //多语句组 -> 单语句组
      case 1, 2:
      case 3:
      case 4:
        System.out.println("Three or Four");
        // 缺失相关注释
      case 5:
        System.out.println("One/Tow/Three/Four/Five");
        break;
    }

    switch (input) {
      //单语句组 -> 多语句组
      case 3:
        System.out.println("Three");
        // 缺失相关注释
      case 5:
      case 6, 7:
        System.out.println("Three/Four/Five/Six/Seven");
        break;
    }
  }
}
