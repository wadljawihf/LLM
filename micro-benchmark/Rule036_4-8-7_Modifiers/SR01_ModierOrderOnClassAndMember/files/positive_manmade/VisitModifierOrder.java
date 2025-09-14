public class VisitModifierOrder {
  // 正确顺序：private → transient → volatile
  private transient volatile int correctField;

  // 正确顺序：public → abstract → static → final
  public abstract static final class CorrectClass {}

  // 正确顺序：protected → final → synchronized
  protected final synchronized void correctMethod() {}

  // 正确顺序：public → native → strictfp
  public native strictfp void nativeMethod();

  // 接口方法默认情况
  public interface SampleInterface {
    public abstract void doWork(); // ok
  }

  // 使用 sealed 类型
  public sealed class SealedParent permits Child1, Child2 {}

  public final class Child1 extends SealedParent {}

  public final class Child2 extends SealedParent {}

}
