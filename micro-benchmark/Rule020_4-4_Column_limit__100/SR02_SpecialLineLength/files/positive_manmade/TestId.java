public class TestId {
  // < 100 characters
  int shortIdentifierNameIsOkay = 1;

  // = 100 characters
  int thisIsaReallyLongIdentifierButStillWithinTheLimitOfOneHundredCharactersSoItIsStillOkay = 1234;

  // > 100 characters (Allowed)
  int thisIsAnExtremelyLongLongLongLongIdentifierNameThatExceedsTheGoogleStyleLimitButIsAllowedInRareCases = 3;

}
