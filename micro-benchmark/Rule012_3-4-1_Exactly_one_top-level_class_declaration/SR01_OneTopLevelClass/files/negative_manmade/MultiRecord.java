record MultiRecord(String name, String email) {}

record Book(String title, Author author) {
  public String details() {
    return title + " by " + author.name();
  }
}