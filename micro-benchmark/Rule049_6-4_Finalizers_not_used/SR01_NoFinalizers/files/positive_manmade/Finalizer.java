public class Finalizer {
  // 正常类，不定义 finalize 方法
  public void cleanUp() {
    System.out.println("Cleaning up manually...");
  }
}
