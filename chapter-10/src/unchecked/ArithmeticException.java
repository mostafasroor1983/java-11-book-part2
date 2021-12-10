package unchecked;

public class ArithmeticException {
  public static void main(String[] args) {
    float f1 = 1 / 0.0f;
    System.out.println(f1);

    double d1 = 1 / 0.0;
    System.out.println(d1);

    // ArithmeticException : divided by 0 not 0.0
    double d2 = 1 / 0;
    System.out.println(d2);
  }
}
