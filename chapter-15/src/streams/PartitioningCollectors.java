package streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitioningCollectors {
  public static void main(String[] args) {
    /*
    * Partitioning is a special case of grouping. With partitioning,
      there are only two possible groups—true and false. Partitioning
      is like splitting a list into two parts.
      * */

    var list = Stream.of("lions", "tigers", "bears");
    Map<Boolean, List<String>> map = list.collect(
      Collectors.partitioningBy(s -> s.length() <= 5));
    System.out.println(map); // {false=[tigers], true= [lions, bears]}

    System.out.println("----------------------------------------------------");

    var list2 = Stream.of("lions", "tigers", "bears");
    Map<Boolean, Set<String>> map2 = list2.collect(
      Collectors.partitioningBy(
        s -> s.length() <= 7,
        Collectors.toSet()));
    System.out.println(map2); // {false=[], true=[lions, tigers, bears]}
  }
}
