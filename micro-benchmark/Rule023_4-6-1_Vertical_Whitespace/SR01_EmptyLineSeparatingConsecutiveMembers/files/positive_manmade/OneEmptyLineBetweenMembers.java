public class OneEmptyLineBetweenMembers {
  // field
  int value;

  // static initializer
  static {
    System.out.println("Static init");
  }

  // instance initializer
  {
    System.out.println("Instance init");
  }

  // constructor
  EmptyLineBetweenMembers(int v) {
    this.value = v;
  }

  // method
  int getValue() {
    return value;
  }

  // nested class
  static class Inner {
    void hello() {
      System.out.println("Hi");
    }
  }
}
class SecondClass{}