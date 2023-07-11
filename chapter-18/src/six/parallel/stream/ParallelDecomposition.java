package six.parallel.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//A parallel decomposition is the process of
//taking a task, breaking it up into smaller pieces that can be
//performed concurrently, and then reassembling the results.
public class ParallelDecomposition {
    private static int doWork(int input) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        return input;
    }

    public static List<Integer> generate(int count) {

        return IntStream.range(0, count)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        generate(100)
                .stream()
                .parallel()
                .map(w -> doWork(w))
                .forEachOrdered(s -> System.out.print(s + " "));
                 //.forEach(s -> System.out.print(s + " "));
        System.out.println();
        var timeTaken = (System.currentTimeMillis() - start) / 1000;
        System.out.println("Time: " + timeTaken + " seconds");
    }
}
