

public class Example6 {

  public void bad() {
    //Java knows that eatCarrot() can’t throw a checked exception—
    //which means there’s no way for the catch block in bad() to be reached.
    // good() need a try/catch
    try {
      //eatCarrot();
      good();
    } catch (NoMoreCarrotsException e ) { // DOES NOT COMPILE with eatCarrot catch block is unreachable
      System.out.print("sad rabbit");
    }
  }
  public void good() throws NoMoreCarrotsException {
    eatCarrot();
  }
  private void eatCarrot() {
    System.out.println("eatCarrot");
  }
}
