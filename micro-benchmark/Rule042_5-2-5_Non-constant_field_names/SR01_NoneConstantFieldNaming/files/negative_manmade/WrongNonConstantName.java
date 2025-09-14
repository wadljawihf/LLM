package com.blankj.subutil.util.negative;

public class WrongNonConstantName {

  int Count;                 // PascalCase
  String User_Name;          // 使用下划线分隔词
  double user_score_average; // 下划线连接多个词
  String MüllersAlgorithm;   // 包含非ASCII字符
  String muller’sAlgorithm;  // 包含撇号

  class Constants {
    // Constants
    static final int NUMBER = 5;
    static final ImmutableList<String> NAMES = ImmutableList.of("Ed", "Ann");
    static final Map<String, Integer> AGES = ImmutableMap.of("Ed", 35, "Ann", 32);
    static final Joiner COMMA_JOINER = Joiner.on(','); // because Joiner is immutable
    static final SomeMutableType[] EMPTY_ARRAY = {};
  }

  class NoConstants {
    // Not constants
    static final Set<String> MUTABLE_COLLECTION = new HashSet<String>();
    static final ImmutableSet<SomeMutableType> MUTABLE_ELEMENTS = ImmutableSet.of(mutable);
    static final ImmutableMap<String, SomeMutableType> MUTABLE_VALUES =
        ImmutableMap.of("Ed", mutableInstance, "Ann", mutableInstance2);
    static final Logger LOGGER = Logger.getLogger(MyClass.getName());
    static final String[] NON_EMPTY_ARRY = {"these", "can", "change"};
    static String NON_FINAL = "non-final";
    final String NON_STATIC = "non-static";
  }

}
