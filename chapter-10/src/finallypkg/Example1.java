package finallypkg;

public class Example1 {
  static void seeAnimals() {
    System.out.println("seeAnimals");
  }

  static void getHugFromDaddy() {
    System.out.println("getHugFromDaddy");
  }

  static void goHome() {
    System.out.println("goHome");
  }

  static void seeMoreAnimals() {
    System.out.println("seeMoreAnimals");
  }

  static void fall() {
    System.out.println("fall");
    throw new IllegalStateException();
  }

  static void explore() {
    try {
      seeAnimals();
      fall();
      //return;
    } catch (Exception e) {
      getHugFromDaddy();
    } finally {
      seeMoreAnimals();
    }

    goHome();
  }

  static void explore2() {
    try {
      fall();
      //1-  the finally block will be executed whether the exception is occurred or not
      //2-  the finally block will be executed whether the exception is catched  or not
    } finally {
      System.out.println("all better");
    }
  }

  public static void main(String[] args) {
    //explore();
    explore2();
  }
}
