package negative.myfilegroup;

public class Child extends Parent implements MyInterface {

  // 错误, 未加 @Override
  void sayHello() {
    System.out.println("Hello from Child");
  }

  // 错误, 未加 @Override
  public void doSomething() {
    System.out.println("Doing something in Child");
  }
}
