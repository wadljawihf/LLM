package com.positive.switchtest;


public class SwitchWithDefault {

  void oldSwitch(int value) {
    switch (value) {
      default:
        // Required by Google Style
        break;
    }
    switch (value) {
      case 0:
        System.out.println("Zero");
        break;
      default:
        // Required by Google Style
        break;
    }
  }

  String newSwitch(int x) {
    switch (x) {
      default ->
          System.out.println("Default");
    }
    switch (x) {
      case 1 ->
          System.out.println("One");
      case 2 ->
          System.out.println("Two");
      default ->
          System.out.println("Other");
    }
    return switch (x) {
      case 1 -> "One";
      case 2 -> "Two";
      default -> "Other";
    };
  }



  String enumOldSwitch(Color color) {
    String result = "NULL";
    switch (color) {
      case RED:
        // System.out.println("RED");
        result = "RED";
        break;
      case GREEN:
        // System.out.println("GREEN");
        result = "GREEN";
        break;
      case BLUE:
        // System.out.println("BLUE");
        result = "BLUE";
        break;
        // 没有 default，但语言允许，因为枚举全列了
    }
    return result;
  }

  String enumNewSwitch(Color color) {
    String result = "NULL";
    switch (color) {
      case RED:
        // System.out.println("RED");
        result = "RED";
        break;
      case GREEN:
        // System.out.println("GREEN");
        result = "GREEN";
        break;
      case BLUE:
        // System.out.println("BLUE");
        result = "BLUE";
        break;
        // 没有 default，但语言允许，因为枚举全列了
    }
    return switch (color) {
      case RED -> "Red";
      case GREEN -> "Green";
      case BLUE -> "Blue";
      // 没有 default，但语言允许，因为枚举全列了
    };
  }

  public static void main(String[] args) {
    SwitchWithDefault sw = new SwitchWithDefault();

    sw.oldSwitch(0);
    System.out.println(sw.newSwitch(1));
    System.out.println(sw.enumOldSwitch(Color.GREEN));
    System.out.println(sw.enumNewSwitch(Color.BLUE));
  }


}
