public class BadNonAsciiChar {

  public static void main(String[] args) {

    String func() {
      // Poor: the reader has no idea what this is.
      String unitAbbrev = "\u03bcs";
      System.out.println("Limit is \u221e");

      // Good: use escapes for non-printable characters, and comment if necessary.
      return '\ufeff' + content; // byte order mark
    }

  }
}
