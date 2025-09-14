public class TypeAnnotation {
  final @Nullable String name;

  List<@Nullable String> names;

  String[] array1 = new @Nullable String[10];

  Map<@Nullable String, Integer> map;

  public @Nullable Person getPersonByName(String name) {
    return null;
  }
}
