package streams;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PrimitivesPredicate {
  public static void main(String[] args) {

    IntPredicate intPredicate = (w) -> w > 0;
    System.out.println(intPredicate.test(1));

    DoublePredicate doublePredicate = (w) -> w > 0;
    System.out.println(doublePredicate.test(1));

    LongPredicate longPredicate = (w) -> w > 0;
    System.out.println(longPredicate.test(1));

  }
}
