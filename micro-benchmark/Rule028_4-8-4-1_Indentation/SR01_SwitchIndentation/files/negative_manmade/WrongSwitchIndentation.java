public class WrongSwitchIndentation {

  void oldStyleSwitch(int number) {
    switch (number) {
    case 1: // 没有相对 switch 的 +2 缩进
      System.out.println("One");
      break;
        case 2: // 缩进过多（+4，不一致）
          System.out.println("Two");
          break;
    default: //  缩进错误（应 +2）
    System.out.println("Other"); // case 内容未进一步缩进
    }
  }

  void newStyleSwitch(int number) {
    switch (number) {
    case 0, 1 -> handleZeroOrOne(); // case label 未缩进
    case 2 ->
        handleWithAnExtremelyLongMethodCallThatWouldNotFitOnTheSameLine();
    case 3 -> { System.out.println("Three");
      log(number);
    }
  default -> {
    System.out.println("Unknown"); // 缩进不足
  }
    }
  }

  void handleZeroOrOne() {
    System.out.println("0 or 1");
  }

  void handleTwoWithAnExtremelyLongMethodCallThatWouldNotFitOnTheSameLine() {
    System.out.println("Long call");
  }

  void log(int n) {
    System.out.println("Log: " + n);
  }
}
