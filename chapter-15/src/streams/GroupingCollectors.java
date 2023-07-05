package streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingCollectors {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------");
        var list = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map = list.collect(
                Collectors.groupingBy(String::length));
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}

        System.out.println("-----------------------------------------------------");

        var list1 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map1 = list1.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.toSet()));
        System.out.println(map1); // {5=[lions, bears], 6= [tigers]}


        System.out.println("-----------------------------------------------------");

        var list2 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, Set<String>> map2 = list2.collect(
                Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toSet()));
        System.out.println(map2); // {5=[lions, bears], 6= [tigers]}

        System.out.println("-----------------------------------------------------");

        var list3 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map3 = list3.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.counting()));
        System.out.println(map3); // {5=2, 6=1}
    }
}
