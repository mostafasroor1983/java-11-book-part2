package streams;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class PrimitivesConsumers {
  public static void main(String[] args) {
    IntConsumer intConsumer = (w) -> System.out.println(w);
    intConsumer.accept(1);

    DoubleConsumer doubleConsumer = (w) -> System.out.println(w);
    doubleConsumer.accept(1.0);

    LongConsumer longConsumer = (w) -> System.out.println(w);
    longConsumer.accept(1);
  }
}
