package finallypkg;

public class Example3 {
  public static void main(String[] args) {
    try {
      System.exit(0);
      //return;
    } finally {
      System.out.print("Never going to get here"); // Not executed
    }
  }
}
