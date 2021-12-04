package overriding.generic;

import java.util.ArrayList;
import java.util.List;

public class BoundedGeneric {

  static List<? super CharSequence> print() {
    List<? super CharSequence> list = new ArrayList<>();
    list.add("A1");
    list.add(new StringBuilder("B1"));
    return list;
  }
  
  public static void main(String[] args) {
    System.out.println(print());
  }
}
