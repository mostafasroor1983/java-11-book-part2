package checked;

import java.io.IOException;

public class HandleException {
  public static void main(String[] args) {
    fall(10);
  }


  // here if we delete catch block and replace it with finally then we should declare the exception in the method declaration
  static void fall(int distance) {
    try {
      if (distance > 10) {
        throw new IOException();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
