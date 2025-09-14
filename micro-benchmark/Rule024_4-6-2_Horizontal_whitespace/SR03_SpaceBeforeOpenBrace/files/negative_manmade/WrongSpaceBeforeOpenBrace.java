public class WrongSpaceBeforeOpenBrace{  // class body 前没有空格
  // class body 前有多个空格
  class NestedClass1   {
    int id;
  }

  // class body 前有tab
  class NestedClass2	{
    int id;
  }

  // 构造器体前没有空格
  WrongSpaceBeforeOpenBrace(){
    System.out.println("Constructor");
  }

  // 构造器体前多个空格
  WrongSpaceBeforeOpenBrace()   {
    System.out.println("Constructor");
  }

  // 构造器体前用tab
  WrongSpaceBeforeOpenBrace()	{
    System.out.println("Constructor");
  }

  // 方法体前没有空格
  void sayHello(){
    System.out.println("Hello");
  }

  // 方法体前多个空格
  void sayHello()   {
    System.out.println("Hello");
  }

  // 方法体前用tab
  void sayHello()	{
    System.out.println("Hello");
  }

  // 控制语句块前没有空格
  void check(int x) {
    if (x > 0){
      System.out.println("Positive");
    } else if (x < 0){
      System.out.println("Negative");
    } else{
      System.out.println("Zero");
    }

    for (int i = 0; i < x; i++){
      System.out.println(i);
    }

    while (x > 0){
      x--;
    }

    do{
      x++;
    } while (x < 10);
  }

  // 控制语句块前有多个空格
  void check(int x) {
    if (x > 0)   {
      System.out.println("Positive");
    } else if (x < 0)   {
      System.out.println("Negative");
    } else   {
      System.out.println("Zero");
    }

    for (int i = 0; i < x; i++)   {
      System.out.println(i);
    }

    while (x > 0)   {
      x--;
    }

    do   {
      x++;
    } while (x < 10);
  }

  // 控制语句块前有tab
  void check(int x) {
    if (x > 0)	{
      System.out.println("Positive");
    } else if (x < 0)	{
      System.out.println("Negative");
    } else	{
      System.out.println("Zero");
    }

    for (int i = 0; i < x; i++)	{
      System.out.println(i);
    }

    while (x > 0)	{
      x--;
    }

    do	{
      x++;
    } while (x < 10);
  }

  // 普通匿名块的前括号位于行首，不做考虑
  void anonymousBlock() {
    {
      int x = 42;
    }
  }



  // 特例 1：注解数组初始化应无空格
  @CustomAnno( {1, 2})
  int value;

  // 特例 2：双层数组初始化应无空格
  String[][] matrix = { {"a", "b"}, {"c", "d"}};
}
