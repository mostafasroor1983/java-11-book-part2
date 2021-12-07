package polymophism;

import java.util.List;

public class Unrelated {
  public static void main(String[] args) {
    Number tickets = 5;
    // does compile because interface limitation compile
    // maybe can pass as a tickets subclass of Number class that implements List interface
    if(tickets instanceof List) {
      System.out.println("Yes");
    }

    // because Integer is final class and can't be subclassed
    Integer tickets3 = 6;
    //if(tickets3 instanceof List) {} // DOES NOT COMPILE

  }
}
