public class WrongTypeAnnotation {

  final String @Nullable name; //  annotation 应放在 String 前

  public Person @Nullable getPersonByName(String name) { //  annotation 应放在 Person 前
    return null;
  }

  List<String @Nullable> names; //  annotation 应在泛型参数类型前

  String[] array1 = new String @Nullable [10]; //  annotation 应在数组元素类型前

  Map<String @Nullable, Integer> map; //  annotation 应在 String 前
}

