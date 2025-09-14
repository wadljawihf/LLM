class WrongJavadocUsageForDefault {
  public class User {
    /**
     * My name.
     */

    /**
     * My name.
     */
    public String name;

    public int id;

    public class FakePublic {
      public int inner_id;
    }

    protected int age;

    private double money;

    String address;

    public String getName() {
      return name;
    }

    protected void func(String name) {
      this.name = name;
    }

    private void deleteName() {
      this.name = "";
    }

    void myFunc() {
      this.name = "";
    }
    /**
     * My Func.
     */
  }

  public record Point(int x, int y) {
    static final Point ORIGIN = new Point(0, 0);

    @Override
    public String toString() {
      return "(" + x + ", " + y + ")";
    }

    public double distanceFromOrigin() {
      return Math.sqrt(x * x + y * y);
    }

    protected double myGetX() {
      return x;
    }

    private double myGetY() {
      return y;
    }
  }

}
/**
 * Test for Javadoc Usage.
 */