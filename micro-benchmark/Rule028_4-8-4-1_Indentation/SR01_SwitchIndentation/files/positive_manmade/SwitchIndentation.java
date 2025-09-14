public class SwitchIndentation {

  void oldStyleSwitch(int number) {
    switch (number) {
      case 1:
        System.out.println("One");
        break;
      case 2:
        System.out.println("Two");
        break;
      default:
        System.out.println("Other");
    }
  }

  void newStyleSwitch(int number) {
    switch (number) {
      case 0, 1 -> handleZeroOrOne();
      case 2 ->
          handleTwoWithAnExtremelyLongMethodCallThatWouldNotFitOnTheSameLine();
      case 3 -> {
        System.out.println("Three");
        log(number);
      }
      default -> {
        System.out.println("Unknown");
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
