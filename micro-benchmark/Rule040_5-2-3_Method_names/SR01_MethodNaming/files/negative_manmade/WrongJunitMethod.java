public class WrongJunitMethod {

  @Test
  void TransferMoney_DeductsFromSource() {}  // 大驼峰

  @Test
  void transferMoney_DeductsFromSource() {}  // 混合驼峰

  @Test
  void TransferMoney_deductsFromSource() {}  // 混合驼峰


}
