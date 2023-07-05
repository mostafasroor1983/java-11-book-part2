package streams;

import java.util.DoubleSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdvancedCollector {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        Stream s1 = Stream.of("A", "B", "C");
        System.out.println(s1.collect(Collectors.joining(",")));

        System.out.println("------------------------------------------");
        var ohMy = Stream.of("lions", "tigers", "bears");
        Double result = ohMy.collect(Collectors.averagingDouble(String::length));
        System.out.println(result);                // 5.333333333333333
        Double d1 = Stream.of(1, 2, 3, 4, 5).collect(Collectors.averagingInt(x -> x));
        System.out.println(d1);

        Double d2 = Stream.of(1.1, 2.2, 3.3, 4.4, 5.5).collect(Collectors.averagingDouble(x -> x));
        System.out.println(d2);
        //3.3
        System.out.println("------------------------------------------");

        Optional<Double> maxOptional =
                Stream.of(1.1, 2.2, 3.3, 4.4, 5.5).collect(Collectors.maxBy((a, b) -> (int) (b - a)));
        maxOptional.ifPresent(System.out::println);//1.1

        System.out.println("------------------------------------------");

        DoubleSummaryStatistics doubleSummaryStatistics =
                Stream.of(1.1, 2.2, 3.3, 4.4, 5.5).collect(Collectors.summarizingDouble(z -> z));
        System.out.println(doubleSummaryStatistics);

        System.out.println("------------------------------------------");
        var ohMy1 = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = ohMy1.collect(
                Collectors.toMap(s -> s, String::length));
        System.out.println(map); // {lions=5, bears=5, tigers=6}

       /* var ohMy2 = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map2 = ohMy2.collect(Collectors.toMap(
          String::length,  k -> k)); //IllegalStateException : Duplicate key 5 (attempted merging values lions and bears)
        System.out.println(map2);*/

        System.out.println("------------------------------------------");

        var list3 = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map3 = list3.collect(Collectors.toMap(
                String::length,
                val -> val + 1,
                (s11, s22) -> s11 + "," + s22));
        System.out.println(map3); // {5=lions,bears, 6=tigers}
        System.out.println(map3.getClass()); // class  java.util.HashMap

        System.out.println("------------------------------------------");

        var list4 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, String> map4 =
                list4.collect(Collectors.toMap(
                        String::length,
                        val -> val + 1,
                        (s13, s23) -> s13 + "," + s23,
                        TreeMap::new));
        System.out.println(map4); // // {5=lions,bears, 6=tigers}
        System.out.println(map4.getClass()); // class ava.util.TreeMap
    }
}
