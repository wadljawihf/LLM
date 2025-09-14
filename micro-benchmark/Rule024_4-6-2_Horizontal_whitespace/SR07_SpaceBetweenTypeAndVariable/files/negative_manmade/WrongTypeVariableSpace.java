public class WrongTypeVariableSpace {

  // 基本类型 — 无空格(不符合语法)
  //  intx;
  //  booleanflag;
  //  doublevalue;

  // 基本类型 — 多个空格
  int     count;
  boolean     isValid;
  float      ratio;

  // 基本类型 — tab
  int	count;
  boolean	isValid;
  float	ratio;

  // 基本类型 — 换行
  char
      symbol;
  long
      timestamp;

  // 引用类型 — 无空格
  List<String>items;
  Map<String, Integer>map;
  Map<String, List<Integer>>complexMap;

  // 引用类型 — 多个空格
  List<String>  items;
  Map<String, Integer>   map;
  Map<String, List<Integer>>  complexMap;

  // 引用类型 — tab
  List<String>	items;
  Map<String, Integer>	map;
  Map<String, List<Integer>>	complexMap;

  // 引用类型 — 换行
  List<String>
      items;
  Map<String, Integer>
      map;
  Map<String, List<Integer>>
      complexMap;

  // 数组类型 — 无空格
  int[]numbers;
  String[][]matrix;

  // 数组类型 — 多空格
  int[]   numbers;
  String[][]  matrix;

  // 数组类型 — tab
  int[]	numbers;
  String[][]	matrix;

  // 数组类型 — 换行
  int[]
      numbers;
  String[][]
      matrix;
}
