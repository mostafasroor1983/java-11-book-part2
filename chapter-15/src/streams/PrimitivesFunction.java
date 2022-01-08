package streams;

import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

public class PrimitivesFunction {
  public static void main(String[] args) {
    IntFunction intFunction = (w) -> w * 10;
    System.out.println(intFunction.apply(1));

    LongFunction longFunction = (w) -> w * 10;
    System.out.println(longFunction.apply(1));

    DoubleFunction doubleFunction = (w) -> w * 10.0;
    System.out.println(doubleFunction.apply(1));

    var d = 1.0;
    DoubleToIntFunction f1 = x -> 1;
    f1.applyAsInt(d);

  }
}
