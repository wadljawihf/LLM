import java.util.Arrays;
import java.util.List;

public class LineBreakForMethodAccessOperator {
  void dotOperatorCompliant() {
    String text = "hello";

    // 点运算符前换行
    String result = text
        .toUpperCase();

    List<String> items = Arrays
        .asList("a", "b", "c");

    int size = items
        .size();
  }

  void methodReferenceCompliant() {
    List<String> items = Arrays.asList("a", "b");

    // 方法引用 :: 前换行
    items.stream()
        .map(String::toUpperCase)
        .forEach(System.out
            ::println);
  }
}
