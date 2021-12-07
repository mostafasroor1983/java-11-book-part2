package polymophism;

import java.util.*;

public class Zoo {
  public void sortAndPrintZooAnimals(List<String> animals) {
    // you can pass any object that implements the List interface : polymorphism based on interface
    // public static <T extends Comparable<? super T>> void sort(List<T> list)
    Collections.sort(animals);
    for (String a : animals) {
      System.out.println(a);
    }
  }
}
