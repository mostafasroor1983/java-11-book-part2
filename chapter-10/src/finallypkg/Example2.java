package finallypkg;

public class Example2 {
  public static void main(String[] args) {
    // without throwing exception print 13 and return -3
    // with    throwing exception print 23 and return -3
    System.out.println(goHome());
  }

  static int goHome() {
    try {
      // Optionally throw an exception here
      fall();
      System.out.print("1");
      return -1;
    } catch (Exception e) {
      //System.out.println(1/0);
      System.out.print("2");
      return -2;
    } finally {
      //System.out.println(1 / 0);
      System.out.print("3");
      return -3;
    }
  }

  static void fall() {
    throw new IllegalStateException();
  }
}
