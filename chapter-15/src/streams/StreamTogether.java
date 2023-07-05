package streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamTogether {
    public static void main(String[] args) {
        var list = List.of("Toby", "Anna", "Leroy", "Alex");
        list.stream()
                .filter(s -> s.length() == 4)
                .sorted() // can't start until all data be ready on the assembly line.
                .limit(3)
                .forEach(System.out::println);

        System.out.println("---------------------------------------------------");

        // this will go to infinite because sort still waiting to get all tha data and the data is infinite
        // if we replace positions of limit and sorted => print Elsa Elsa
//        Stream.generate(() -> "Elsa")
//                .filter(n -> n.length() == 4)
//                .sorted() // can't start until all data be ready on the assembly line. => infinite
//                .limit(2)
//                .forEach(System.out::println);

        System.out.println("---------------------------------------------------");

        var infinite = Stream.iterate(1, x -> x + 1);
        infinite.limit(5)
                .peek(System.out::print)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::print);

        System.out.println("---------------------------------------------------");

        var infinite2 = Stream.iterate(1, x -> x + 1);
        infinite2.filter(x -> x % 2 == 1)
                .limit(5)
                .forEach(System.out::print); // 13579

        System.out.println("---------------------------------------------------");

        var infinite3 = Stream.iterate(1, x -> x + 1);
        infinite3.filter(x -> x % 2 == 1)
                .peek(System.out::print)
                .limit(5)
                .forEach(System.out::print); //1133557799

    }
}
