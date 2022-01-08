package streams;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollector {
  public static void main(String[] args) {
    Stream.of(1, 2, 4).collect(Collectors.toSet());

    StringBuilder word = Stream.of("w", "o", "l", "f").collect(
      StringBuilder::new,
      StringBuilder::append,
      StringBuilder::append);
    System.out.println(word);                                   // wolf

    TreeSet<String> set = Stream.of("w", "o", "l", "f").collect(
      TreeSet::new,
      TreeSet::add,
      TreeSet::addAll);
    System.out.println(set);                                   // [f, l, o, w]

    TreeMap<String, Integer> map = Stream.of("w", "o", "l", "f").collect(
      TreeMap::new,
      (partialMap, element) -> partialMap.put(element, element.length()),
      (totalMap, partialMap) -> totalMap.putAll(partialMap));
    System.out.println(map);                                  //{f=f, l=l, o=o, w=w}

    System.out.println(map.entrySet().stream()
      .collect(Collectors.groupingBy(Map.Entry::getValue))); //{1=[f=1, l=1, o=1, w=1]}
  }
}
