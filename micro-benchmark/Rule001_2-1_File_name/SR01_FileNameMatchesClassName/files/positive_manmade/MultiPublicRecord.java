public record MultiPublicRecord(String name, int capacity) {}

public record Book(String title, String author) {
  public String citation() {
    return author + ". " + title + ".";
  }
}