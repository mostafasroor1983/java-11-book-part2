package streams;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class PrimitivesUnaryOperator {
  public static void main(String[] args) {
    IntUnaryOperator intUnaryOperator = (w) -> w * 10;
    System.out.println(intUnaryOperator.applyAsInt(1));

    LongUnaryOperator longUnaryOperator = (w) -> w * 10;
    System.out.println(longUnaryOperator.applyAsLong(1));

    DoubleUnaryOperator doubleUnaryOperator = (w) -> w * 10;
    System.out.println(doubleUnaryOperator.applyAsDouble(1));
  }
}
