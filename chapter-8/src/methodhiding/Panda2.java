package methodhiding;

class Bear2 {
  public static void sneeze() {
    System.out.println("Bear2 is sneezing");
  }

  public static void laugh() {
    System.out.println("Bear2 is laughing");
  }

  public void hibernate() {
    System.out.println("Bear2 is hibernating");
  }
}

public class Panda2 extends Bear2 {
  // missing static keyword in the parent class
  /*public static void hibernate() { // DOES NOT COMPILE
    System.out.println("Panda2 is going to sleep");
  }*/

  // more restrictive access modifier violate the method overriding the is required also for method hidden
 /* protected static void laugh() { // DOES NOT COMPILE
    System.out.println("Panda2 is laughing");
  }*/

  // missing static keyword in the child class
 /* public void sneeze() { // DOES NOT COMPILE
    System.out.println("Panda2 sneezes quietly");
  }*/
}