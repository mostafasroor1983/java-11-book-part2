package questions;

import java.util.HashSet;
import java.util.Iterator;

public class Question7 {
  // when iterating through the set => indeterminate output
  public static void main(String[] args) {
    var numbers = new HashSet<Number>();
    numbers.add(Integer.valueOf(86));
    numbers.add(75);
    numbers.add(Integer.valueOf(86));
    numbers.add(null);
    numbers.add(309L);
    Iterator iter = numbers.iterator();
    while (iter.hasNext()) {
      System.out.print(iter.next());
    }
  }
}
