package functionalInterfaces;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class TestingConsumer {
    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);
        c1.accept("Mostafa");
        c2.accept("Annie");

        BiConsumer<String, String> c22 = (x, y) -> System.out.println(x + " " + y);
        c22.accept("Mostafa", "Srour");

        System.out.println("--------------------");

        var map = new HashMap<String, Integer>();

        // instance method reference
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
        b1.accept("A", 1);
        b2.accept("B", 2);
        System.out.println(map);
    }
}
