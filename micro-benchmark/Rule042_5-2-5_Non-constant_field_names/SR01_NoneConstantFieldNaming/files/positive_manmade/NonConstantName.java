public class NonConstantName {

  int count;
  String userName;
  double userScoreAverage;
  String muellersAlgorithm; // from "Müller's algorithm"
  String muellersAlgorithmV2;
  String guava33_4_6; // 特例：允许数字之间下划线连接

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
    static final Set<String> mutableCollection = new HashSet<String>();
    static final ImmutableSet<SomeMutableType> mutableElements = ImmutableSet.of(mutable);
    static final ImmutableMap<String, SomeMutableType> mutableValues =
        ImmutableMap.of("Ed", mutableInstance, "Ann", mutableInstance2);
    static final Logger logger = Logger.getLogger(MyClass.getName());
    static final String[] nonEmptyArray = {"these", "can", "change"};
    static String nonFinal = "non-final";
    final String nonStatic = "non-static";
  }

}
