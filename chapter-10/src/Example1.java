public class Example1 {
  public static void main(String[] args) {
    try {
      throw new RuntimeException();
      // This line of code can never be reached at runtime
      // throw new ArrayIndexOutOfBoundsException(); // DOES NOT COMPILE
    } catch (Exception e) {
    }
  }
}
