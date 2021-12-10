package tryresources;

import java.util.Scanner;

public class Example3 {

  public static void main(String[] args) {
    // s variable scope just within try block
    try ( Scanner s = new Scanner(System.in)) {
      s.nextLine();
    } catch(Exception e) {
      //s.nextInt(); // DOES NOT COMPILE, because s var is out of his scope
    } finally {
      //s.nextInt(); // DOES NOT COMPILE, because s var is out of his scope
    }
  }

}
