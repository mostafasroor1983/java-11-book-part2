package generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcard {
  public static void main(String[] args) {
    //ArrayList<Number> list = new ArrayList<Integer>(); // DOES  NOT COMPILE

    //instead of we define
    List<? extends Number> list = new ArrayList<Integer>();

    System.out.println(total(List.of(1, 2, 3, 5)));
  }

  // List<? extends Number> all classes that parent upper class is Number
  public static long total(List<? extends Number> list) {
    long count = 0;
    for (Number number : list) {
      count += number.longValue();
    }
    return count;
  }

}
