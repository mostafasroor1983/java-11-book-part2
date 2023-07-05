package streams;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermediate {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m"))
                .forEach(System.out::println); // monkey

        System.out.println("--------------------------------------------");

        //The distinct() method returns a stream with duplicate values removed.
        Stream.of("duck", "duck", "duck", "goose")
                .distinct()
                .forEach(System.out::println); // duckgoose

        System.out.println("--------------------------------------------");

        Stream.iterate(1, n -> n + 1)
                .skip(5)
                .limit(3)
                .forEach(System.out::println); // 67

        System.out.println("--------------------------------------------");

        Stream.of("monkey", "gorilla", "bonobo")
                .map(String::length)
                .forEach(System.out::println); // 676

        System.out.println("--------------------------------------------");

        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla", "Bonobo");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        System.out.println(animals
                .flatMap(Collection::stream)
                .collect(Collectors.toSet()));

        System.out.println("--------------------------------------------");

        Stream.of("brown-", "bear-")
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println); // bear-brown-

        System.out.println("--------------------------------------------");

        Stream.of(new Employee(1L, "Omar"),
                        new Employee(2L, "Ali"),
                        new Employee(3L, "Yasmeen")
                )
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("--------------------------------------------");

        Stream.of(new Employee(1L, "Omar"),
                        new Employee(2L, "Ali"),
                        new Employee(3L, "Yasmeen")
                )
                .sorted((a, b) -> a.getName().compareTo(b.getName()))
                .forEach(System.out::println);

        System.out.println("--------------------------------------------");

        long count = Stream.of("black bear", "brown bear", "grizzly")
                .filter(s1 -> s1.startsWith("g"))
                .peek(System.out::println)  // grizzly
                .count();                   // 1
        System.out.println(count);

    }

    private static class Employee implements Comparable<Employee> {
        private Long Id;
        private String name;

        public Employee(Long id, String name) {
            Id = id;
            this.name = name;
        }

        public Long getId() {
            return Id;
        }

        public void setId(Long id) {
            Id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Employee employee = (Employee) o;

            if (!Id.equals(employee.Id)) {
                return false;
            }
            return name.equals(employee.name);
        }

        @Override
        public int hashCode() {
            int result = Id.hashCode();
            result = 31 * result + name.hashCode();
            return result;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "Id=" + Id +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Employee o) {
            return o.getId().compareTo(this.getId());
        }
    }


}
