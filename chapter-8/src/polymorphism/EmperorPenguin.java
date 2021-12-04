package polymorphism;

class Penguin {
  public int getHeight() {
    return 3;
  }

  public void printInfo() {
    System.out.print(this.getHeight());
  }
}

public class EmperorPenguin extends Penguin {
  public static void main(String[] fish) {
    new EmperorPenguin().printInfo(); // 8
  }

  // just the single solution to call getHeight() method in parent Penguin  class on the EmperorPenguin object
 /* public void printInfo() {
    System.out.print(super.getHeight());
  }*/

  public int getHeight() {
    return 8;
  }
}