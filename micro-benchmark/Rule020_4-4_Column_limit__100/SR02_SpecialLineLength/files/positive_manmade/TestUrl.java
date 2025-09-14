class TestUrl {
  /**
   * URL < 100 chars.
   * See: https://example.com/api/v1/search?query=short
   */
  public class JavadocUrl1 {}

  /**
   * URL = 100 chars.
   * See: https://example.com/abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcgjcdhij
   */
  public class JavadocUrl2 {}

  /**
   * URL > 100 chars.
   * See: https://example.com/this/is/a/really/long/url/that/should/not/be/broken/according/to/google/style/guide
   */
  public class JavadocUrl3 {}
}
