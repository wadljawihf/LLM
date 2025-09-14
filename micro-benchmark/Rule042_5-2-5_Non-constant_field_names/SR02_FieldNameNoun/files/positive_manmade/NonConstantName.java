public class NonConstantName {

  int count;
  String userName;
  double userScoreAverage;
  String muellersAlgorithm; // from "Müller's algorithm"
  String muellersAlgorithmV2;

  class Constants {
    // Constants
    static final int NUMBER = 5;
    static final ImmutableList<String> NAMES = ImmutableList.of("Ed", "Ann");
    static final Map<String, Integer> AGES = ImmutableMap.of("Ed", 35, "Ann", 32);
    static final Joiner COMMA_JOINER = Joiner.on(','); // because Joiner is immutable
    static final SomeMutableType[] EMPTY_ARRAY = {};
  }


}
