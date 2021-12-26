package enumpkg;

enum OnlyOne {
  ONCE(true);

  // private implicitly
  private OnlyOne(boolean b) {
    System.out.print("constructing,");
  }
}

public class PrintTheOne {
  public static void main(String[] args) {
    System.out.print("begin,");
    OnlyOne firstCall = OnlyOne.ONCE; // prints  constructing,
    OnlyOne secondCall = OnlyOne.ONCE; // doesn't print  anything
    System.out.print("end");
  }
}