package com.didichuxing.doraemondemo.amap.negative;

public class WrongArrowIndentation {

  // 增加缩进 = 0
  void indent4() {
    execute((String s) ->
    System.out.println(s)
    );
    Function<Integer, Integer> doubler = (Integer x) ->
    x * 2;

    switch (str) {
      case "one" ->
      System.out.println("One");
      default ->
      System.out.println("Other");
    }

    return (String str) ->
    str.length();
  }

  // 增加缩进 = 2
  void indent4() {
    execute((String s) ->
      System.out.println(s)
    );
    Function<Integer, Integer> doubler = (Integer x) ->
      x * 2;

    switch (str) {
      case "one" ->
        System.out.println("One");
      default ->
        System.out.println("Other");
    }

    return (String str) ->
      str.length();
  }



  void execute(Function<String, ?> func) {}
}
