package streams;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollector2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = Stream.of("w", "o", "l", "f")
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeSet); // [f, l, o, w]

        System.out.println("-------------------------------------");

        Map<Integer, String> map = Stream.of("w", "o", "l", "f")
                .collect(Collectors.toMap(e -> e.length(), e -> e));
        System.out.println(map);

        System.out.println("-------------------------------------");

        Set<String> set = Stream.of("w", "o", "l", "f")
                .collect(Collectors.toSet());
        System.out.println(set);
    }
}
