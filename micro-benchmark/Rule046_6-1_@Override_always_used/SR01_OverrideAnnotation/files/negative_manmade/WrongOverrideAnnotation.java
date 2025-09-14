public class WrongOverrideAnnotation {

  interface MyInterface {
    void doSomething();
  }

  class Parent {
    void sayHello() {
      System.out.println("Hello from Parent");
    }
  }

  class Child extends Parent implements MyInterface {

    // 错误：未加 @Override
    void sayHello() {
      System.out.println("Hello from Child");
    }

    // 错误：未加 @Override 实现接口方法
    public void doSomething() {
      System.out.println("Doing something...");
    }
  }

  interface BaseInterface {
    void baseMethod();
  }

  interface DerivedInterface extends BaseInterface {
    // 错误：未使用 @Override 重新声明接口方法
    void baseMethod();
  }

}
