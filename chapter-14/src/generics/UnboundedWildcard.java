package generics;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcard {
  public static void main(String[] args) {
    List<String> keywords = new ArrayList<>();
    keywords.add("java");
    //printList(keywords); // DOES NOT COMPILE because printList is defined with List<Object> to solve use List<?>
    printListWildcard(keywords);
    printListWildcard(List.of(1, 2, 3));
  }

  public static void printList(List<Object> list) {
    for (Object x : list) {
      System.out.println(x);
    }
  }

  public static void printListWildcard(List<?> list) {
    for (Object x : list) {
      System.out.println(x);
    }
  }

  public static void doesntCompile() {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(new Integer(42));
    //List<Object> objects = numbers; // DOES NOT COMPILE, we can't assign List<Integer> reference to List<Object> reference
    //objects.add("forty two");
    //System.out.println(numbers.get(1));
  }

  private static void playWithWildcard() {
    List<?> b = new ArrayList<String>();
    List<? extends Exception> c = new ArrayList<RuntimeException>();
    List<? super Exception> d = new ArrayList<Object>();
  }
}
