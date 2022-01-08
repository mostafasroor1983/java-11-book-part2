package functionalInterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class TestingPredicate {
  public static void main(String[] args) {
    Predicate<String> p1 = String::isEmpty;
    Predicate<String> p2 = x -> x.isEmpty();
    System.out.println(p1.test("")); // true
    System.out.println(p2.test("")); // true

    System.out.println("----------------------------");

    BiPredicate<String, String> b1 = String::startsWith;
    BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
    System.out.println(b1.test("chicken", "chick")); // true
    System.out.println(b2.test("chicken", "chick")); // true

  }
}
