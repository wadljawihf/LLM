public class WrongStaticUsage {

  public static class Utils {
    public static void log(String msg) {
      System.out.println("LOG: " + msg);
    }
  }

  public void run() {
    Utils util = new Utils();
    util.log("Starting..."); // 不应使用变量调用静态方法

    getUtils().log("Again"); // 更严重：表达式调用
  }

  private Utils getUtils() {
    return new Utils();
  }
}
