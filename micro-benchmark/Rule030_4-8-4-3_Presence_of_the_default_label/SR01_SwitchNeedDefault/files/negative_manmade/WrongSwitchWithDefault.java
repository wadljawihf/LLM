package com.negative.wrongswitchtest;


public class WrongSwitchWithDefault {

  void oldSwitch(int value) {
    switch (value) {

    }
    switch (value) {
      case 0:
        System.out.println("Zero");
        break;
    }
  }

  String newSwitch(int x) {
    switch (x) {

    }
    switch (x) {
      case 1 ->
          System.out.println("One");
      case 2 ->
          System.out.println("Two");

    }
    use(switch (x) {
      case 1 -> "One";
      case 2 -> "Two";
    });
    return switch (x) {
      case 1 -> "One";
      case 2 -> "Two";
    };
  }



  String enumOldSwitch(Color color) {
    String result = "NULL";
    switch (color) {
      case GREEN:
        // System.out.println("GREEN");
        result = "GREEN";
        break;
      case BLUE:
        // System.out.println("BLUE");
        result = "BLUE";
        break;
        // 没有 default，且没有枚举全
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
      case BLUE:
        // System.out.println("BLUE");
        result = "BLUE";
        break;
        // 没有 default，且没有枚举全
    }
    use(switch (color) {
      case RED -> "Red";
      case GREEN -> "Green";
      // 没有 default，且没有枚举全
    });
    return switch (color) {
      case GREEN -> "Green";
      case BLUE -> "Blue";
      // 没有 default，且没有枚举全
    };
  }

  public static void main(String[] args) {
    WrongSwitchWithDefault sw = new WrongSwitchWithDefault();

    sw.oldSwitch(0);
    System.out.println(sw.newSwitch(1));
    System.out.println(sw.enumOldSwitch(Color.GREEN));
    System.out.println(sw.enumNewSwitch(Color.BLUE));
  }

  void use(String str) {
    System.out.println(str);
  }

}
