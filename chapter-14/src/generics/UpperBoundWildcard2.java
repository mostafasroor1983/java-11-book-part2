package generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcard2 {
  public static void main(String[] args) {
    List<? extends Bird> birds = new ArrayList<Bird>();
    /*
    * The problem stems from the fact that Java doesn't know what
      type List<? extends Bird> really is. It could be List<Bird> or
      List<Sparrow> or some other generic type that hasn't even been
      written yet.*/
    //birds.add(new Sparrow()); // DOES NOT COMPILE
    //birds.add(new Bird()); // DOES NOT COMPILE
  }

  static class Sparrow extends Bird {
  }

  static class Bird {
  }
}
