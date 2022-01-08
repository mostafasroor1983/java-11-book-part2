package streams;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPrimitives {
  public static void main(String[] args) {
    Stream<Integer> stream2 = Stream.of(1, 2, 3);
    System.out.println(stream2.reduce(0, (s, n) -> s + n)); // 6

    System.out.println("------------------------------------------");

    Stream<Integer> stream3 = Stream.of(1, 2, 3);
    System.out.println(stream3.mapToInt(x -> x).sum());            // 6

    System.out.println("------------------------------------------");

    System.out.println(IntStream.of(1, 2, 3).sum());               // 6

    System.out.println("------------------------------------------");

    OptionalDouble avg = IntStream.of(1, 2, 3).average();
    System.out.println(avg.getAsDouble());                         // 2.0
    IntSummaryStatistics intSummaryStatistics = IntStream.of(1, 2, 3).summaryStatistics();
    System.out.println(intSummaryStatistics.getMax());
    System.out.println(intSummaryStatistics.getCount());
    System.out.println(intSummaryStatistics.getSum());

    System.out.println("------------------------------------------");

    System.out.println(IntStream.of('a', 'b', 'c', 'd').sum());
    StringBuilder sb = IntStream.of('a', 'b', 'c', 'd')
      .mapToObj(a -> (char) a)
      .collect(StringBuilder::new,
        StringBuilder::append,
        StringBuilder::append);
    System.out.println(sb.toString());

    System.out.println(IntStream.of('a', 'b', 'c', 'd')
      .mapToObj(Character::toString)            //String.valueOf((char)a)
      .collect(Collectors.joining("")));

    System.out.println("------------------------------------------");

    DoubleStream empty = DoubleStream.empty();
    DoubleStream oneValue = DoubleStream.of(3.14);
    oneValue.forEach(System.out::println);
    DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
    varargs.forEach(System.out::println);

    System.out.println("------------------------------------------");

    var random = DoubleStream.generate(Math::random);
    var fractions = DoubleStream.iterate(.5, d -> d / 2);
    random.limit(3).forEach(System.out::println);
    fractions.limit(3).forEach(System.out::println);

  }
}
