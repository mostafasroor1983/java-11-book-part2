package generics;

import java.util.ArrayList;
import java.util.List;

public class TestingWithoutGeneric {
  static void printNames(List list) {
    for (int i = 0; i < list.size(); i++) {
      // because couldn't be cast StringBuilder to String
      String name = (String) list.get(i); // ClassCastException
      System.out.println(name);
    }
  }

  public static void main(String[] args) {
    // we can solve this problem by using List<String> so that the compiler fail once adding non-expected values to the list
    List names = new ArrayList();
    names.add(new StringBuilder("Webby"));
    printNames(names);
  }
}
