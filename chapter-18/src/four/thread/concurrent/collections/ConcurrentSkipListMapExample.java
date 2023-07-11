package four.thread.concurrent.collections;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapExample {
    public static void main(String[] args) {
        Map<String, String> rainForestAnimalDiet = new ConcurrentSkipListMap<>();
        rainForestAnimalDiet.put("koala", "bamboo");
        rainForestAnimalDiet.put("apple", "apple");
        rainForestAnimalDiet.put("orange", "Arange");
        rainForestAnimalDiet.entrySet()
                .stream()
                .forEach((e) -> System.out.println(
                        e.getKey() + "-" + e.getValue()));
    }
}
