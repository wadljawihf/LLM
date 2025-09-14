public class EscapeSequence {
  public static void main(String[] args) {
    String backspace = "A\bB";         // backspace
    String tab = "A\tB";               // tab
    String newline = "A\nB";           // newline
    String formfeed = "A\fB";          // form feed
    String carriageReturn = "A\rB";    // carriage return
    String whitespace = "A B";         // space (0x20, direct)
    String quote = "He said: \"Hi\"";  // double quote
    String apostrophe = "It\'s OK";    // single quote
    String backslash = "C:\\Path\\To\\File"; // backslash

    char ch1 = '\b';
    char ch2 = '\t';
    char ch3 = '\n';
    char ch4 = '\f';
    char ch5 = '\r';
    char ch6 = ' ';
    char ch7 = '\"';
    char ch8 = '\'';
    char ch9 = '\\';

    System.out.println(backspace + tab + newline + formfeed + carriageReturn);
    System.out.println(quote + " / " + apostrophe + " / " + backslash);
  }
}
