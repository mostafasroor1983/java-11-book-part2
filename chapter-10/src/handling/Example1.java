package handling;

public class Example1 {

  public static void main(String[] args) {
    explore();
  }


  static void explore() {

    /*try { // DOES NOT COMPILE, because we want another finally or catch block at least
      fall();
    }*/

    try {
      fall();
      //throw new RuntimeException();
      System.out.println("never get here");
    } catch (RuntimeException e) {
      System.out.println("handled");
      getUp();
    }
    seeAnimals();
  }

  static void fall() {
    throw new RuntimeException();
  }

  static void getUp() {
    System.out.println("getting up");
  }

  static void seeAnimals() {
    System.out.println("continue seeing animals");
  }
}
