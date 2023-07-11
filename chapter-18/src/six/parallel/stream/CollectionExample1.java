package six.parallel.stream;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionExample1 {

    public static List<String> generate(int count) {

        return IntStream.range(0, count)
                .boxed()
                .map(i -> String.valueOf(i))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        //Recall that elements in a ConcurrentSkipListSet are sorted
        //according to their natural ordering.
        SortedSet<String> sortedSet = generate(20)
                .stream()
                .parallel()
                .collect(ConcurrentSkipListSet<String>::new,
                        Set::add,
                        Set::addAll);
        System.out.println(sortedSet);
    }
}
