class NoMoreCarrotsException extends Exception {
}

public class Example5 {
  /*public static void main(String[] args) throws NoMoreCarrotsException { // declare  exception
    eatCarrot();
  }*/
  public static void main(String[] args) {
    try {
      // no need to throw exception in eatCarrot method just declare it is enough to force us to handle or declare
      eatCarrot();
    } catch (NoMoreCarrotsException e) { // handle  exception
      System.out.print("sad rabbit");
    }
  }

  private static void eatCarrot() throws NoMoreCarrotsException {

  }

}
