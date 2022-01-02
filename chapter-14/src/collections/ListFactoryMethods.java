package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFactoryMethods {
  public static void main(String[] args) {
    String[] array = new String[] {"a", "b", "c"};
    List<String> asList = Arrays.asList(array);   // [a, b, c]
    List<String> of = List.of(array);             // [a, b, c]
    List<String> copy = List.copyOf(asList);      // [a, b, c]
    array[0] = "z";
    System.out.println(asList);                   // [z, b, c]
    System.out.println(of);                       // [a, b, c]
    System.out.println(copy);                     // [a, b, c]
    asList.set(0, "x");
    System.out.println(Arrays.toString(array));   // [x, b, c]
    //copy.add("y");                                // throws UnsupportedOperationException

    System.out.println("---------------------");
    List<String> list = new ArrayList<>();
    list.add("SD");                   // [SD]
    list.add(0, "NY");   // [NY,SD]
    list.set(1, "FL");                // [NY,FL]
    System.out.println(list.get(0));  // NY
    list.remove("NY");             // [FL]
    list.remove(0);              // []
    //list.set(0, "?");                  // IndexOutOfBoundsException

    // replaceAll
    System.out.println("---------------------");
    List<Integer> numbers = Arrays.asList(1, 2, 3);
    numbers.replaceAll(x -> x * 2);
    System.out.println(numbers);    // [2, 4, 6]
  }
}
