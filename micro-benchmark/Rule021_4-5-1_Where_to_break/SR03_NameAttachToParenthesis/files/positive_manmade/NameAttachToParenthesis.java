public class NameAttachToParenthesis {

  // 构造函数名紧挨 (
  public NameAttachToParenthesisCompliant() {
  }

  // 方法名紧挨 (
  public void doSomething() {
    System.out.println("Doing something");
  }


  // record 类名紧挨 (
  record User(String name, int age) {}
}
