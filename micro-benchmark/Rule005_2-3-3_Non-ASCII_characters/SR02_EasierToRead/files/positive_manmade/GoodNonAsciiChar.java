public class GoodNonAsciiChar {

  public static void main(String[] args) {

    String func() {
      // Best: perfectly clear even without a comment.
      String unitAbbrev = "μs";
      System.out.println("Limit is ∞");

      // Good: use escapes for non-printable characters, and comment if necessary.
      return '\ufeff' + content; // byte order mark
    }

  }
}
