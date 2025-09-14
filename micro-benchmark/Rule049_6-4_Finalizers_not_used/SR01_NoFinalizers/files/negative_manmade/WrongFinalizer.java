public class WrongFinalizer {
  @Override
  protected void finalize() throws Throwable { // 禁止重写
    try {
      System.out.println("Finalizing...");
    } finally {
      super.finalize();
    }
  }
}
