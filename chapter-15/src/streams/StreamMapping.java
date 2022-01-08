package streams;

import java.util.ArrayList;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamMapping {
  public static void main(String[] args) {
    //Another way to create a primitive stream is by mapping from another stream type.
    Stream<String> objStream = Stream.of("penguin", "fish");
    IntStream intStream = objStream.mapToInt(s -> s.length());
    LongStream longStream = Stream.of("penguin", "fish").mapToLong(s -> s.length());
    DoubleStream doubleStream = Stream.of("penguin", "fish").mapToDouble(s -> s.length());

    //FlatMap
    var integerList = new ArrayList<Integer>();
    IntStream ints = integerList.stream()
      .flatMapToInt(x -> IntStream.of(x));

    DoubleStream doubles = integerList.stream()
      .flatMapToDouble(x -> DoubleStream.of(x));

    LongStream longs = integerList.stream()
      .flatMapToLong(x -> LongStream.of(x));

    Stream<Integer> ints2 = IntStream.of(1, 2, 4).mapToObj(x -> x);
    Stream<Integer> ints3 = IntStream.of(1, 2, 4).boxed();
  }

  //you can create a Stream from a primitive stream.
  private static Stream<Integer> mapping(IntStream stream) {
    return stream.mapToObj(x -> x);
  }

  //you can create a Stream from a primitive stream.
  private static Stream<Integer> boxing(IntStream stream) {
    return stream.boxed();
  }
}
