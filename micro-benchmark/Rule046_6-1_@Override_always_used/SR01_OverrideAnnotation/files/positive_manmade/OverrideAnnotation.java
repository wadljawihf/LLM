public class OverrideAnnotation {

  interface MyInterface {
    void doSomething();
  }

  class Parent {
    void sayHello() {
      System.out.println("Hello from Parent");
    }
  }

  class Child extends Parent implements MyInterface {

    // 正确：重写父类方法，使用了 @Override
    @Override
    void sayHello() {
      System.out.println("Hello from Child");
    }

    // 正确：实现接口方法，使用了 @Override
    @Override
    public void doSomething() {
      System.out.println("Doing something...");
    }
  }

  interface BaseInterface {
    void baseMethod();
  }

  interface DerivedInterface extends BaseInterface {
    // 正确：重新声明父接口的方法，也使用了 @Override（Java 8+ 支持）
    @Override
    void baseMethod();
  }

}
