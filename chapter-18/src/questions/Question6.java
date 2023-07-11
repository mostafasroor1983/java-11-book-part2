package questions;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

public class Question6 {
    public static void main(String[] args) throws Exception {
        var data = List.of(2, 5, 1, 9, 8);
        data.stream().parallel()
                .mapToInt(s -> s)
                .peek(System.out::println)
                .forEachOrdered(System.out::println);
    }
}
