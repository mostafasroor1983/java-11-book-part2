package streams;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MappingCollector {
    public static void main(String[] args) {
        var list = Stream.of("lions", "tigers", "bears");
        Map<Integer, Optional<Character>> map = list.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(
                                s -> s.charAt(0),
                                Collectors.minBy((a, b) -> b - a))));
        System.out.println(map); // {5=Optional[l], 6=Optional[t]}
    }
}
