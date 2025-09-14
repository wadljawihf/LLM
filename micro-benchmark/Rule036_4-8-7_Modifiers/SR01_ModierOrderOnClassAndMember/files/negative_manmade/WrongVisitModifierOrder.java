public class WrongVisitModifierOrder {
  public class ModifierOrderWrongExamples {
    // 字段修饰符顺序乱序
    volatile static private final int badField = 0;

    // 访问控制顺序错误：private 在 abstract 后
    abstract private class WrongAccessOrder {}

    // 抽象语义顺序错误：abstract 在 default 后
    public default abstract class WrongAbstractOrder {}

    // 类状态顺序错误：static在  final 后
    public final static class WrongStateOrder {}

    // 并发修饰符顺序错误：volatile 在 transient 前
    private volatile transient int wrongConcurrencyField;

    // 本地/平台修饰符顺序错误：native在  strictfp 后
    public strictfp native void wrongPlatformMethod();

    // 全部乱序，极端情况
    static final public synchronized native strictfp abstract class FullyWrong {}

    // 方法修饰符顺序乱序
    synchronized public static final void badMethod() {}




  }

}
