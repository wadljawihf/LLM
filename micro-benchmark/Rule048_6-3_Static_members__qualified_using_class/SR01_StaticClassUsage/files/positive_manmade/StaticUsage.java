public class StaticUsage {
  public static class Utils {
    public static void log(String msg) {
      System.out.println("LOG: " + msg);
    }
  }

  public void run() {
    Utils.log("Starting...");
  }
}
