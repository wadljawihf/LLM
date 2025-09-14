public record OnePublicRecord(String title, String author) {
  public String summary() {
    return title + " by " + author;
  }
}