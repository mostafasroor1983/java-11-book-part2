package streams;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class PrimitivesBinaryOperator {
  public static void main(String[] args) {
    IntBinaryOperator intBinaryOperator = (a, b) -> a + b;
    System.out.println(intBinaryOperator.applyAsInt(5, 5));

    LongBinaryOperator longBinaryOperator = (a, b) -> a + b;
    System.out.println(longBinaryOperator.applyAsLong(5, 5));

    DoubleBinaryOperator doubleBinaryOperator = (a, b) -> a + b;
    System.out.println(doubleBinaryOperator.applyAsDouble(5.0, 5.0));

  }
}
