package streams;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class OptionalPrimitives {
  public static void main(String[] args) {
    System.out.println("---------------------------------------");

    OptionalDouble optionalDouble = IntStream.rangeClosed(1, 10).average();
    System.out.println(optionalDouble.getAsDouble());
    optionalDouble.ifPresent(System.out::println);
    System.out.println(optionalDouble.orElse(Double.NaN));
    System.out.println(optionalDouble.orElseGet(() -> Double.NaN));

    System.out.println("-----------------------------------------");

    int sum = IntStream.rangeClosed(1, 10).sum();
    System.out.println("sum:" + sum);

    OptionalInt minOptional = IntStream.rangeClosed(1, 10).min();
    System.out.println("min:" + minOptional.getAsInt());

    OptionalLong maxOptional = LongStream.rangeClosed(1, 10).max();
    System.out.println("max:" + maxOptional.getAsLong());

    OptionalDouble avgOptional = IntStream.rangeClosed(1, 1000).average();
    System.out.println("avg:" + avgOptional.getAsDouble());

    System.out.println("range:" + range(IntStream.rangeClosed(1, 1000)));
  }

  private static int range(IntStream intStream) {
    IntSummaryStatistics stats = intStream.summaryStatistics();

    if (stats.getCount() == 0) {
      throw new RuntimeException("no values");
    }
    return stats.getMax() - stats.getMin();
  }
}
