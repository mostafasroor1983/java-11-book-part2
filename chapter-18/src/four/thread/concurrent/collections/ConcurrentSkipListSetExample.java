package four.thread.concurrent.collections;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;

public class ConcurrentSkipListSetExample {
    public static void main(String[] args) {
        // it is the concurrent version of TreeSet
        //maintain elements or keys in the natural ordering of their elements.
        Set<String> gardenAnimals = new ConcurrentSkipListSet<>();
        gardenAnimals.add("rabbit");
        gardenAnimals.add("gopher");
        System.out.println(gardenAnimals.stream()
                .collect(Collectors.joining(","))); // gopher,rabbit
    }
}
