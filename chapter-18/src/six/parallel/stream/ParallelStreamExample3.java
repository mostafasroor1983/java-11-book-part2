package six.parallel.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamExample3 {

    public static List<String> generate(int count) {

        return IntStream.range(0, count)
                .boxed()
                .map(i -> String.valueOf(i))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(generate(1000)
                .stream()
                //.parallel()
                .reduce("", (s, c) -> s + " " + c, (s1, s2) -> s1 + "||" + s2));
        System.out.println();
        var timeTaken = (System.currentTimeMillis() - start) / 1000;
        System.out.println("Time: " + timeTaken + " seconds");


        System.out.println(List.of(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .reduce(0, (a, b) -> (a - b))); // PROBLEMATIC ACCUMULATOR


        System.out.println(List.of("w", "o", "l", "f")
                .parallelStream()
                .reduce("X", String::concat)); // XwXoXlXf

        System.out.println(List.of("w", "o", "l", "f")
                .stream()
                .reduce("X", String::concat)); // Xwolf

    }
}
