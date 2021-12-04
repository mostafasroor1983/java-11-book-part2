package initialization;

public class ZooTickets {
  private static int COUNT = 0;

  static {
    System.out.print(COUNT + "-");
  }

  static {
    COUNT += 10;
    System.out.print(COUNT + "-");
  }

  private String name = "BestZoo";

  {
    System.out.print(name + "-");
  }

  public ZooTickets() {
    System.out.print("z-");
  }

  public static void main(String... patrons) {
    new ZooTickets(); //0-10-BestZone-z-
  }
}
