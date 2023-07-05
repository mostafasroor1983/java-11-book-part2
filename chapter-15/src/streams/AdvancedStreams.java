package streams;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class AdvancedStreams {
    public static void main(String[] args) {
        var cats = new ArrayList<String>();
        cats.add("Annie");
        cats.add("Ripley");
        var stream = cats.stream();
        cats.add("KC");
        System.out.println(stream.count());

        System.out.println("--------------------------------");

        threeDigit(Optional.of(333));
        threeDigitFunctional1(Optional.of(333));
        threeDigitFunctional2(Optional.of(333));
        threeDigitFunctional3(Optional.of(333));

        System.out.println("---------------------------------");

        Optional<String> optional = Optional.of("Mostafa");
        Optional<Integer> result = optional.map(String::length);
        result.flatMap(e -> calc(e)).ifPresent(System.out::println);
        Optional.of("Mostafa").flatMap(e -> calc2(e)).ifPresent(System.out::println);
    }


    private static Optional<Integer> calc(int e) {
        return Optional.of(e + 10);
    }

    private static Optional<String> calc2(String e) {
        return Optional.of(e + 10);
    }

    private static void threeDigit(Optional<Integer> optional) {
        if (optional.isPresent()) { // outer if
            var num = optional.get();
            var string = "" + num;
            if (string.length() == 3) // inner if
            {
                System.out.println(string);
            }
        }
    }

    private static void threeDigitFunctional1(Optional<Integer> optional) {
        optional.ifPresent(e -> {
            if (e.toString().length() == 3) {
                System.out.println(e);
            }
        });
    }

    private static void threeDigitFunctional2(Optional<Integer> optional) {
        Predicate<Integer> predicate1 = (e) -> Objects.isNull(e);
        Predicate<Integer> predicate2 = (e) -> e.toString().length() == 3;
        optional.filter(predicate1.negate().and(predicate2))
                .ifPresent(System.out::println);
    }

    private static void threeDigitFunctional3(Optional<Integer> optional) {
        optional.map(n -> n.toString())     // part 1
                .filter(s -> s.length() == 3)     // part 2
                .ifPresent(System.out::println);  // part 3
    }

}
