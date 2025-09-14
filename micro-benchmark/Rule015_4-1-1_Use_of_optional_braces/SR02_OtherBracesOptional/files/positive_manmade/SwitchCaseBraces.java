public class SwitchCaseBraces {
  public static void main(String[] args) {
    int value = 2;

    switch (value) {
      // 不带大括号（合法）
      case 1:
        System.out.println("One");
        break;

      // 带大括号（合法）
      case 2: {
        System.out.println("Two");
        break;
      }

      default:
        System.out.println("Other");
    }
  }
}