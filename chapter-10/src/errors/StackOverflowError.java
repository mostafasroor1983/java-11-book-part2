package errors;

public class StackOverflowError {
  public static void main(String[] args) {
    dontCode(100);
  }

  static void dontCode(int i) {
    dontCode(1);
  }
}
