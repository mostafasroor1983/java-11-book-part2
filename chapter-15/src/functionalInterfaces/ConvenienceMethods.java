package functionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConvenienceMethods {
    public static void main(String[] args) {
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");
        Predicate<String> eggAndBrown = egg.and(brown);
        Predicate<String> eggOrBrown = egg.or(brown);
        Predicate<String> eggBrownNegated = egg.and(brown).negate();

        System.out.println(eggAndBrown.test("eggAndbrown"));        //true
        System.out.println(eggOrBrown.test("eggOrbrown"));          //true
        System.out.println(eggBrownNegated.test("eggbrownNegated"));//false

        System.out.println("-----------------------------------");
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = s -> System.out.println(s + " Srour");
        c1.andThen(c2).accept("Mostafa");

        System.out.println("-----------------------------------");
        Function<String, String> f1 = String::toUpperCase;
        Function<String, Integer> f2 = String::length;
        Function<String, String> f3 = String::toLowerCase;
        // f1 then f2
        System.out.println(f1.andThen(f2).apply("mostafa"));
        // f3 first then f1
        System.out.println(f1.compose(f3).apply("mostafa"));

        System.out.println("-----------------------------------");
        Function<Integer, Integer> a11 = x -> x + 1;
        Function<Integer, Integer> a22 = x -> x * 2;
        Function<Integer, Integer> combined = a22.compose(a11);
        Function<Integer, Integer> andThen = a22.andThen(a11);
        System.out.println(combined.apply(3)); // 8
        System.out.println(andThen.apply(3));  // 7
    }
}
