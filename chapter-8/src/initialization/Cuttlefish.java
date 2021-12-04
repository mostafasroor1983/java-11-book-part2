package initialization;

public class Cuttlefish {
  private static int COUNT = 0;

  static {
    System.out.println(COUNT);
  }

  private String name = "swimmy";

  {
    System.out.println(name);
  }

  {
    COUNT++;
    System.out.println(COUNT);
  }

  public Cuttlefish() {
    System.out.println("Constructor");
  }

  public static void main(String[] args) {
    System.out.println("Ready");
    new Cuttlefish();
    //0
    //Ready
    //swimmy
    // 1
    //Constructor
  }
}