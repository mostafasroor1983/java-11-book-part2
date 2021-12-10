package questions;

public class Mouse {
  public String name;

  public static void main(String... tom) {
    Mouse jerry = new Mouse();
    jerry.findCheese();
  }

  public void findCheese() {
    System.out.print("1");
    try {
      System.out.print("2");
      name.toString();
      System.out.print("3");
    } catch (NullPointerException | ClassCastException e) {
      System.out.print("4");
      throw e;
    }

    System.out.print("5");
  }
}