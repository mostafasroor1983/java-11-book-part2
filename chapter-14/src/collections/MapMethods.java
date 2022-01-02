package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;

public class MapMethods {
  public static void main(String[] args) {
    //HashMap
    Map<String, String> hashMap = new HashMap<>();
    hashMap.put("koala", "bamboo");
    hashMap.put("lion", "meat");
    hashMap.put("giraffe", "leaf");
    String food = hashMap.get("koala"); // bamboo
    for (String key : hashMap.keySet()) {
      System.out.print(key + ","); // koala,giraffe,lion,
    }

    System.out.println("--------------------------------");

    //TreeMap, sorted map based on keys
    Map<String, String> treeMap = new TreeMap<>();
    treeMap.put("koala", "bamboo");
    treeMap.put("lion", "meat");
    treeMap.put("giraffe", "leaf");
    String food2 = treeMap.get("koala"); // bamboo
    for (String value : treeMap.values()) {
      System.out.print(value + ","); // leaf,bamboo,meat,
    }

    System.out.println("--------------------------------");

    //some checking
    //System.out.println(map.contains("lion")); // DOES NOT  COMPILE
    System.out.println(treeMap.containsKey("lion"));   // true
    System.out.println(treeMap.containsValue("lion")); // false
    System.out.println(treeMap.size());                // 3
    treeMap.clear();
    System.out.println(treeMap.size());                // 0
    System.out.println(treeMap.isEmpty());             // true

    System.out.println("--------------------------------");

    Map<Integer, Character> hashMap1 = new HashMap<>();
    hashMap1.put(1, 'a');
    hashMap1.put(2, 'b');
    hashMap1.put(3, 'c');
    hashMap1.forEach((k, v) -> System.out.println("key:" + k + ",value:" + v));
    hashMap1.entrySet().forEach(e -> System.out.println(e.getKey() + "," + e.getValue()));

    System.out.println("--------------------------------");

    //getOrDefault()
    Map<Character, String> map = new HashMap<>();
    map.put('x', "spot");
    System.out.println("X marks the " + map.get('x'));                            //spot
    System.out.println("X marks the " + map.getOrDefault('x', ""));//spot
    System.out.println("Y marks the " + map.get('y'));                            //null
    System.out.println("Y marks the " + map.getOrDefault('y', ""));//""

    System.out.println("--------------------------------");

    //replace,replaceAll
    Map<Integer, Integer> hashMap2 = new HashMap<>();
    hashMap2.put(1, 2);
    hashMap2.put(2, 4);
    // if key is present it replaces the value with new one and return the old value, else return null
    Integer original = hashMap2.replace(2, 10); // 4
    System.out.println("original:" + original);
    System.out.println(hashMap2);               // {1=2, 2=10}
    // replace values using BiFunction(K,V,Y)
    hashMap2.replaceAll((k, v) -> k + v);
    System.out.println(hashMap2);               // {1=3, 2=12}

    System.out.println("--------------------------------");

    //putIfAbsent()
    //The putIfAbsent() method sets a value in the map but skips it if
    //the value is already set to a non‐ null value.
    Map<String, String> favorites = new HashMap<>();
    favorites.put("Jenny", "Bus Tour");
    favorites.put("Tom", null);
    favorites.putIfAbsent("Jenny", "Tram");
    favorites.putIfAbsent("Sam", "Tram");
    favorites.putIfAbsent("Tom", "Tram");
    System.out.println(favorites); // {Tom=Tram, Jenny=Bus Tour, Sam=Tram}

    System.out.println("--------------------------------");

    //merge()
    BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

    Map<String, String> favoritesHashMap = new HashMap<>();
    favoritesHashMap.put("Jenny", "Bus Tour");
    favoritesHashMap.put("Tom", "Tram");
    favoritesHashMap.put("Sam", null);

    String jenny = favoritesHashMap.merge("Jenny", "Skyride", mapper);
    String tom = favoritesHashMap.merge("Tom", "Skyride", mapper);

    // because Sam's value is null here the mapper will not be called, and new value will be used
    favoritesHashMap.merge("Sam", "Skyride", mapper);
    favoritesHashMap.merge("Sam111", "Skyride111", mapper);
    System.out.println(favoritesHashMap); // {Tom=Skyride, Sam111=Skyride111, Jenny=Bus Tour, Sam=Skyride}
    System.out.println(jenny);            // Bus Tour
    System.out.println(tom);              // Skyride
  }
}
