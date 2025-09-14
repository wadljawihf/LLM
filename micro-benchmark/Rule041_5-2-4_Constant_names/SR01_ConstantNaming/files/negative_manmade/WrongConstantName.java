public class WrongConstantName {
  class Constants {
    // Constants
    static final int NUMbER = 5;
    static final ImmutableList<String> names = ImmutableList.of("Ed", "Ann");
    static final Map<String, Integer> AGES__MAP = ImmutableMap.of("Ed", 35, "Ann", 32);
    static final Joiner _JOINER = Joiner.on(','); // because Joiner is immutable
    static final SomeMutableType[] EMPTY_ = {};
  }

  class NoConstants {
    // Not constants due to mutability
    static final Set<String> MUTABLE_COLLECTION = new HashSet<>(); // mutable collection
    static final ImmutableSet<SomeMutableType> MUTABLE_ELEMENTS =
        ImmutableSet.of(mutable); // mutable content
    static final ImmutableMap<String, SomeMutableType> MUTABLE_VALUES =
        ImmutableMap.of("Ed", mutableInstance, "Ann", mutableInstance2); // mutable values
    static final String[] NON_EMPTY_ARRAY = {"these", "can", "change"}; // array with content
    static final Logger LOGGER = Logger.getLogger(MyClass.getName()); // Logger is mutable

  }
}
