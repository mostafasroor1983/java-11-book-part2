package overriding;

class Camel {
  public int getNumberOfHumps() {
    return 1;
  }
}

class BactrianCamel extends Camel {
  // private int getNumberOfHumps() { // DOES NOT COMPILE
  // it is at least same access modifier or more open to guarantee it is accessible at runtime call
  public int getNumberOfHumps() {
    return 2;
  }
}

public class Rider {
  public static void main(String[] args) {
    Camel c = new BactrianCamel();
    System.out.print(c.getNumberOfHumps());
  }
}