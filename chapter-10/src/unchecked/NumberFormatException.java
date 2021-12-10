package unchecked;

// thrown by java when converting from String to int, float....
public class NumberFormatException {
  public static void main(String[] args) {
    // NumberFormatException is subclass of IllegalArgumentException
    System.out.println(Integer.parseInt("abc"));
  }
}
