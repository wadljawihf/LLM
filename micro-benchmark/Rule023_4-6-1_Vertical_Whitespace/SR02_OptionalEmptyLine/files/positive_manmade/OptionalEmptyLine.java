public class OptionalEmptyLine {
  // 第一个成员前的空行（可选，合法）


  // 连续字段之间无空行（合法）
  private int id;
  private String name;

  // 连续字段之间加了空行，用于逻辑分组（合法）
  private double salary;

  private boolean active;

  // 普通方法
  void print() {
    System.out.println(name + ": $" + salary);
  }



  // 类最后一个成员后的空行（可选，合法）
}
