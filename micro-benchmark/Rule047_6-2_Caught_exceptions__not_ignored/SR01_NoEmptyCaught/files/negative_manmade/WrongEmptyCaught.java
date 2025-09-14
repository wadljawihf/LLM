public class WrongEmptyCaught {
  public void example() {
    try {
      int x = 1 / 0;
    } catch (ArithmeticException e) {

    } // 没有解释为什么忽略异常

    try {
      closeResource();
    } catch (Exception e) {

    }// 彻底空 catch，没有注释也没有操作
  }

  private void closeResource() throws Exception {
    // mock resource
  }
}
