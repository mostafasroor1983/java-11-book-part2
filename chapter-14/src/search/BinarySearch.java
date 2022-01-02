package search;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearch {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(6, 9, 1, 8);
    Collections.sort(list);                                    // [1, 6, 8, 9]
    System.out.println(Collections.binarySearch(list, 6)); // 1
    System.out.println(Collections.binarySearch(list, 3)); // -2 => -expected-position -1

    System.out.println("-------------------------------");

    var names = Arrays.asList("Fluffy", "Hoppy");
    Comparator<String> c = Comparator.reverseOrder();
   // Collections.sort(names, c);
   // System.out.println(names);
    var index = Collections.binarySearch(names, "Hoppy",c);
    System.out.println(index);

  }
}
