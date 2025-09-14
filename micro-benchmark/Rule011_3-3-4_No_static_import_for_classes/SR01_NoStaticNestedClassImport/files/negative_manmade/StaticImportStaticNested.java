import static com.Outer.Inner;  // 不允许静态导入内嵌类

public class StaticImportStaticNested {
  public static void main(String[] args) {
    System.out.println("StaticImportStaticNested:");
    Inner.hello();
  }
}
