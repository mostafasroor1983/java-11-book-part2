package six.parallel.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStream {

    public static List<Integer> generate(int count) {

        return IntStream.range(0, count)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        generate(1000).stream()
                .parallel()
                .forEach(System.out::println);

        System.out.println("----------------");
        generate(1000).parallelStream()
                .forEach(System.out::println);
    }
}
