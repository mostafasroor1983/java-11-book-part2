package collections;

import java.util.Map;
import java.util.TreeMap;

public class MapFactoryMethods {
  public static void main(String[] args) {
    Map map1 = Map.of(1, "1", 2, "2");
    Map map2 = Map.ofEntries(Map.entry(1, "1"), Map.entry(2, "2"));
    System.out.println(map1);
    System.out.println(map2);

    Map copiedMap = Map.copyOf(map1);
    System.out.println(copiedMap);

    // treeMap maintain the map sorted based on keys
    Map treeMap = new TreeMap();
    treeMap.putAll(Map.of(12,-1,-1,3,2,1));
    System.out.println(treeMap);
  }
}
