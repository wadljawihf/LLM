public class DeprecatedOverride {

  // 父类，包含一个 @Deprecated 的方法
  static class LegacyBase {

    @Deprecated
    public void oldApi1() {
      System.out.println("Legacy method1");
    }

    @Deprecated
    public void oldApi2() {
      System.out.println("Legacy method2");
    }

    public void stableApi() {
      System.out.println("Stable method");
    }
  }

  // 子类，重写方法
  static class Derived extends LegacyBase {

    // 正常：重写方法必须使用 @Override
    @Override
    public void oldApi1() {
      System.out.println("Still supporting legacy");
    }

    // 合法：父类方法是 @Deprecated，所以 @Override 可以省略
    public void oldApi2() {
      System.out.println("Still supporting legacy");
    }

    // 正常：重写非 Deprecated 方法必须使用 @Override
    @Override
    public void stableApi() {
      System.out.println("New behavior");
    }
  }

  public static void main(String[] args) {
    Derived d = new Derived();
    d.oldApi();
    d.stableApi();
  }
}
