package two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args) {
        // java inferred about the sort method by using Consumer
        Consumer<List<Integer>> methodRef = Collections::sort;
        Consumer<List<Integer>> lambda = x -> Collections.sort(x);

        //Predicate
        String s = "Mostafa";
        Predicate<String> predicate1 = element -> s.startsWith(element);
        Predicate<String> predicate2 = s::startsWith;
        if (predicate1.test("M")) {
            System.out.println("Yes M");
        }

        if (predicate2.test("S")) {
            System.out.println("Yes S");
        }

        List<String> list = List.of("M", "A", "B");
        System.out.println(list.stream().filter(s::startsWith).collect(Collectors.toList()));
        System.out.println(list.stream().filter(String::isBlank).collect(Collectors.toList()));

        //Supplier : CALLING INSTANCE METHODS ON A PARTICULAR OBJECT
        //The String class has a startsWith() method that takes one parameter and returns a boolean.
        var random = new Random();
        Supplier<Integer> supp1 = random::nextInt;
        Supplier<Integer> supp2 = () -> random.nextInt();
        System.out.println(supp1.get());
        System.out.println(supp2.get());

        //CALLING INSTANCE METHODS ON A PARAMETER
        //This time, we are going to call an instance method that doesn't take any parameters.
        Predicate<String> predicate3 = String::isEmpty;
        Predicate<String> predicate4 = s1 -> s1.isEmpty();

        //BiPredicate
        BiPredicate<String, String> biPredicate1 = String::startsWith;
        BiPredicate<String, String> biPredicate2 = (s1, p1) -> s1.startsWith(p1);
        if (biPredicate1.test("mostafa", "m")) {
            System.out.println("mostafa is startsWith m");
        }

        //CALLING CONSTRUCTORS
        Supplier<List<String>> supp3 = ArrayList::new;
        Supplier<List<String>> supp4 = () -> new ArrayList();

        //Function
        Function<Integer, List<String>> func1 = ArrayList::new;
        Function<Integer, List<String>> func2 = x -> new ArrayList(x);

        List<String> list1 = func1.apply(1);
        List<String> list2 = func1.apply(1);
        System.out.println(list1);
        System.out.println(list2);
    }
}
