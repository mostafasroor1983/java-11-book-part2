package nestedStaticClass;

public class Enclosing {
  private static String hi = "Hi";

  public static void main(String[] args) {
    Nested nested = new Nested();
    System.out.println(nested.price);
    nested.print();
  }

  static class Nested {
    private int price = 6;

    public int getPrice() {
      return price;
    }

    public void print() {
      System.out.println(hi);
    }
  }
}