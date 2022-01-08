package streams;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReduce {
  public static void main(String[] args) {

    //Optional<T> reduce(BinaryOperator<T> accumulator);
    Optional<Integer> reduce1 = Stream.of(1, 2, 3, 4, 5).reduce((a, b) -> a + b);
    reduce1.ifPresent(System.out::println);

    // T reduce(T identity, BinaryOperator<T> accumulator);
    Integer reduce2 = Stream.of(1, 2, 3, 4, 5).reduce(0, (a, b) -> a + b);
    System.out.println(reduce2);

    //  <U> U reduce(U identity,
    //                 BiFunction<U, ? super T, U> accumulator,
    //                 BinaryOperator<U> combiner);
    Stream<String> stream = Stream.of("w", "o", "l", "f!");
    int length = stream.reduce(0, (i, s) -> i + s.length(), (a, b) -> a +  b );
    System.out.println(length);       // 5

    System.out.println("-----------------------------------------------------");
    String word = Stream.of("w", "o", "l", "f").reduce("", String::concat);
    System.out.println(word);            // wolf
    Stream.of("w", "o", "l", "f")
      .reduce(String::concat)
      .ifPresent(System.out::println);   // wolf

    System.out.println("-----------------------------------------------------");
    System.out.println(Stream.of(3, 5, 6).reduce(1, (a, b) -> a * b));   // 90
    Stream.of(3, 5, 6).reduce((a, b) -> a * b).ifPresent(System.out::println); // 90

    System.out.println("-----------------------------------------------------");

    BinaryOperator<Integer> op = (a, b) -> a * b;
    Stream<Integer> empty = Stream.empty();
    Stream<Integer> oneElement = Stream.of(3);
    Stream<Integer> threeElements = Stream.of(3, 5, 6);

    /*
    * If the stream is empty, an empty Optional is returned.
      If the stream has one element, it is returned.
      If the stream has multiple elements, the accumulator is applied to combine them.
      * */
    empty.reduce(op).ifPresent(System.out::println);         // no output
    oneElement.reduce(op).ifPresent(System.out::println);    // 3
    threeElements.reduce(op).ifPresent(System.out::println); // 90
  }
}
