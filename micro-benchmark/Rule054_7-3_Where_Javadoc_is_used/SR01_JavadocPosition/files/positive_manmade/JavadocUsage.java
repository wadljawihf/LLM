/**
 * Test for Javadoc Usage.
 */
public class JavadocUsage {
  /**
   * Represents a user in the system.
   */
  public class User {

    /**
     * The user's name.
     */
    public String name;

    /**
     * Returns the user's name.
     */
    public String getName() {
      return name;
    }

    /**
     * Need Javadoc Also.
     */
    protected void setName(String name) {
      this.name = name;
    }

    private void deleteName() {
      this.name = "";
    }

    void myFunc(){

    }
  }


  /**
   * A record representing a point in 2D space.
   */
  public record Point(int x, int y) {
    static final Point ORIGIN = new Point(0, 0);

    @Override
    public String toString() {
      return "(" + x + ", " + y + ")";
    }

    /**
     * Get the distance.
     */
    public double distanceFromOrigin() {
      return Math.sqrt(x * x + y * y);
    }


    /**
     * My get X.
     */
    protected double myGetX() {
      return x;
    }

    private double myGetY() {
      return y;
    }
  }

}
