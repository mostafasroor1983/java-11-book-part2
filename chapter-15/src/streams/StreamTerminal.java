package streams;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTerminal {
  public static void main(String[] args) {

    long count = IntStream.range(0, 10).count();
    System.out.println("count:" + count);

    OptionalInt min = IntStream.range(0, 100).min();
    min.ifPresentOrElse(m -> System.out.println(m), () -> {
      throw new RuntimeException("no minimum value");
    });

    OptionalInt max = IntStream.range(0, 100).max();
    max.ifPresentOrElse(m -> System.out.println(m), () -> {
      throw new RuntimeException("no maximum value");
    });

    Stream<Employee> employeeStream = Stream.of(new Employee("A", 24),
      new Employee("B", 25), new Employee("B", 38));
    Optional<Employee> minEmployee = employeeStream.min((e1, e2) -> e2.getAge() - e1.getAge());// descending by age
    System.out.println("minEmployee:" + minEmployee);

    Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
    System.out.println(minEmpty.isPresent()); // false

    Optional<Integer> any = Stream.of(1, 2, 4).findAny();
    any.ifPresentOrElse(m -> System.out.println(m), () -> {
      throw new RuntimeException("no any value");
    });

    System.out.println("-------------------");

    Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
    Stream<String> infinite = Stream.generate(() -> "chimp");
    s.findAny().ifPresent(System.out::println);         //  monkey (usually)
    infinite.findAny().ifPresent(System.out::println);  // chimp

    System.out.println("-------------------");

    boolean anyMatch = DoubleStream.of(.2, 1.3, 1.4).anyMatch(e -> e < 1);
    System.out.println(anyMatch);

    boolean allMatch = DoubleStream.of(.2, 1.3, 1.4).allMatch(e -> e > 1);
    System.out.println(allMatch);

    boolean noneMatch = DoubleStream.of(.2, 1.3, 1.4).noneMatch(e -> e > 2);
    System.out.println(noneMatch);

    double multiplication = DoubleStream.of(.2, 1.3, 1.4).reduce(1, (a, b) -> a * b);
    System.out.println("multiplication:" + multiplication);

    System.out.println("----------------------------------------------------");

    var list2 = List.of("monkey", "2", "chimp");
    Stream<String> infinite2 = Stream.generate(() -> "chimp");
    Predicate<String> pred2 = x -> Character.isDigit(x.charAt(0));
    //Predicate<String> pred2 = x -> Character.isLetter(x.charAt(0));
    System.out.println(list2.stream().anyMatch(pred2));  // true
    System.out.println(list2.stream().allMatch(pred2));  // false
    System.out.println(list2.stream().noneMatch(pred2)); // false
    System.out.println(infinite2.anyMatch(pred2));       // true


    System.out.println("---------------------------------------------------------");
    Stream<Integer> s1 = Stream.of(1);
    /*
    * While forEach() sounds like a loop, it is really a terminal
      operator for streams. Streams cannot be used as the source in a
      for‐each loop to run because they don't implement the Iterable
      interface.*/
    //for (Integer i : s1) {} // DOES NOT COMPILE

  }


  static class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
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

      return getAge() == employee.getAge();
    }

    @Override
    public int hashCode() {
      return getAge();
    }

    @Override
    public String toString() {
      return "Employee{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
    }
  }
}
