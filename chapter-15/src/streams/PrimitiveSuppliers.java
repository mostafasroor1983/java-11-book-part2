package streams;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class PrimitiveSuppliers {
  public static void main(String[] args) {
    BooleanSupplier booleanSupplier = () -> Math.random() > .3;
    System.out.println(booleanSupplier.getAsBoolean());

    IntSupplier intSupplier = () -> 10;
    System.out.println(intSupplier.getAsInt());

    LongSupplier longSupplier = () -> 10L;
    System.out.println(longSupplier.getAsLong());

    DoubleSupplier doubleSupplier = () -> 10.0;
    System.out.println(doubleSupplier.getAsDouble());
  }
}
