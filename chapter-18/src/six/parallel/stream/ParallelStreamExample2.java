package six.parallel.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamExample2 {

    public static List<Integer> generate(int count) {

        return IntStream.range(0, count)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        //The results of ordered operations on a parallel
        //stream will be consistent with a serial stream. For example,
        //calling skip(5).limit(2).findFirst() will return the same
        //result on ordered serial and parallel streams.
        System.out.println("Serial : " +
                generate(25)
                        .stream()
                        .skip(4)
                        .limit(2)
                        .findFirst().get());

        System.out.println("Parallel : " +
                generate(25)
                        .stream()
                        .parallel()
                        .skip(4)
                        .limit(2)
                        .findFirst().get());
    }
}
