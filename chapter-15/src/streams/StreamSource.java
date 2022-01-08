package streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamSource {
  public static void main(String[] args) {
    //Creating finite stream
    Stream<String> empty = Stream.empty();            // count = 0
    Stream<Integer> singleElement = Stream.of(1);     // count = 1
    Stream<Integer> fromArray = Stream.of(1, 2, 3);   // count = 3

    //Converting collection to stream
    var list = List.of("a", "b", "c");
    Stream<String> fromList = list.stream();

    //Creating parallel stream
    Stream<String> fromListParallel = list.parallelStream();

    //Creating Infinite Streams, Converting it to finite using limit
    Stream.generate(Math::random)./*limit(10).*/forEach(System.out::println);
    Stream.iterate(1, n -> n + 2)./*limit(100).*/forEach(System.out::println);
    Stream.iterate(1, n -> n < 10, n -> n + 2).forEach(System.out::println);
  }
}
