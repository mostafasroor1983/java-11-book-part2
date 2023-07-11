package six.parallel.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionExample4 {
    //Stateful lambda
    public static List<Integer> addValues(IntStream source) {
        var data = Collections.synchronizedList(new
                ArrayList<Integer>());
        source.filter(s -> s % 2 == 0)
                .forEach(i -> {
                    data.add(i);
                }); // STATEFUL: DON'T DO THIS!
        return data;
    }

    //Stateless lambda
    public static List<Integer> addValues2(IntStream source) {
        return source.filter(s -> s % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        var list = addValues(IntStream.range(1, 11).parallel());
        System.out.println(list);

        var list2 = addValues2(IntStream.range(1, 11).parallel());
        System.out.println(list2);

    }
}
