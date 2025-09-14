public class NoEscapeSequence {
  public static void main(String[] args) {
    String backspace1 = "AB";       // 0x08 (ASCII backspace)
    String backspace2 = "A\u0008 B";
    String backspace3 = "A\010B";
    String tab1 = "A	B";            // 0x09 tab
    String tab2 = "A\u0009B";
    String tab3 = "A\011B";
    String newline1 = "A\u000AB";         // 0x0A newline
    String newline2 = "A\012B";
    String formfeed1 = "AB";       // 0x0C form feed
    String formfeed2 = "A\u000CB";
    String formfeed3 = "A\014B";
    String carriageReturn1 = "A\u000D B"; // 0x0D carriage return
    String carriageReturn2 = "A\015 B";

    String quote1 = "He said: \u0022Hi \u0022"; // unicode quotes, not escaped
    String quote2 = "He said: \042Hi \042";


    String apostrophe1 = "It's OK";  // unicode apostrophe
    String apostrophe2 = "It\u0027s OK";
    String apostrophe3 = "It\047s OK";

    String backslash = "C:＼Path＼To＼File"; // full-width backslash U+FF3C
    String backslash2 = "C:\u005C Path";
    String backslash3 = "C:\134Path";


    System.out.println(backspace + tab + newline + formfeed + carriageReturn);
    System.out.println(quote + " / " + apostrophe + " / " + backslash);
  }
}
