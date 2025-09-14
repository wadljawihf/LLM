package com.blankj.subutil.util.negative;

public class WrongLineBreakForArrow {
  public void lambdaExamples() {
    // 非法：箭头前换行
    Function<String, String> func1 = (s)
        -> {
      return s.toUpperCase();
    };

    // 非法：箭头后换行（不满足单表达式例外条件）
    Function<String, String> func2 = (s) ->
    {
      return s.trim();
    };

    // 非法：箭头前后都换行
    Function<String, String> func1 = (s)
        ->
    {
      return s.toUpperCase();
    };

    // 非法：箭头前换行，即使是单表达式也不允许
    Predicate<String> pred = s
        -> s.isEmpty();

  }


  public void switchArrowExample(int num) {
    // 非法：箭头前换行
    switch (num) {
      case 1
          -> System.out.println("One");
      case 2
          -> {
        System.out.println("Two");
        System.out.println("Two");
      }
    }

    // 非法：箭头后换行
    switch (num) {
      case 3 ->
      {
        System.out.println("Three");
        System.out.println("Three");
        System.out.println("Three");
      }
    }

    // 非法：箭头前后换
    switch (num) {
      case 4
          ->
      {
        System.out.println("Four");
        System.out.println("Four");
        System.out.println("Four");
        System.out.println("Four");
      }
    }
  }
}
