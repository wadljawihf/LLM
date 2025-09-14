public class ArrowIndentation {

  // 使用缩进 = 4
  void indent4() {
    execute((String s) ->
        System.out.println(s)
    );
    Function<Integer, Integer> doubler = (Integer x) ->
            x * 2;

    return (String str) ->
        str.length();
  }

  // 使用缩进 = 6
  void indent4() {
    execute((String s) ->
          System.out.println(s)
    );
    Function<Integer, Integer> doubler = (Integer x) ->
          x * 2;

    return (String str) ->
          str.length();
  }



  void execute(Function<String, ?> func) {}
}
