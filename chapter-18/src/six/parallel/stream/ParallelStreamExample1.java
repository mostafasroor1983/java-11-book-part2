package six.parallel.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamExample1 {

    public static List<Integer> generate(int count) {

        return IntStream.range(0, count)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Serial : " +
                generate(10)
                        .stream()
                        .findAny().get());

        System.out.print("Parallel : " +
                generate(10)
                        .parallelStream()
                        .findAny().get());
    }
}
