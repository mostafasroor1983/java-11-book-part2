package streams;

import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class BoxingStream {
  public static void main(String[] args) {
    // Creating an IntStream
    IntStream stream = IntStream.range(3, 8);

    // Creating a Stream of Integers
    // Using IntStream boxed() to return
    // a Stream consisting of the elements
    // of this stream, each boxed to an Integer.
    Stream<Integer> stream1 = stream.boxed();

    // Displaying the elements
    stream1.forEach(System.out::println);

    System.out.println("---------------------------------------------");

    double result = LongStream.of(6L, 8L, 10L)
      .mapToInt(x -> (int) x)
      .boxed()
      .collect(Collectors.groupingBy(x -> x))
      .keySet()
      .stream()
      .collect(Collectors.averagingInt(x -> x));
    System.out.println(result);

    System.out.println("---------------------------------------------");

    Stream<Integer> s = Stream.of(1);
    //IntStream is = s.boxed();
    DoubleStream ds = s.mapToDouble(x -> x);
    IntStream s2 = ds.mapToInt(x -> (int) x);
    s2.forEach(System.out::print);

  }
}
