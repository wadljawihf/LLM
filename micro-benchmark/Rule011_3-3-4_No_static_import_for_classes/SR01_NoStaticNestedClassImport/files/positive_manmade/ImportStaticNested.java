import com.Outer.Inner;

public class ImportStaticNested {
  public static void main(String[] args) {
    System.out.println("ImportStaticNested:");
    Inner.hello();  // 正确使用方式
  }
}
