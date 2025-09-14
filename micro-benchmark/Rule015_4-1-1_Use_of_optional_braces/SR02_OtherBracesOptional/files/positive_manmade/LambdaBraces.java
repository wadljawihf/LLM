import java.util.List;

public class LambdaBraces {
  public static void main(String[] args) {
    List<String> items = List.of("A", "B", "C");

    // 不带大括号（合法）
    items.forEach(item -> System.out.println(item));

    // 带大括号（合法）
    items.forEach(item -> {
      System.out.println("Item: " + item);
    });

    // 带 return + 大括号（合法）
    items.stream().map(s -> {
      return s.toLowerCase();
    }).forEach(System.out::println);
  }
}
