package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamReduce2 {
  public static void main(String[] args) throws Exception {
    List<Person> persons =
      Arrays.asList(
        new Person("Max", 18),
        new Person("Peter", 23),
        new Person("Moh", 20),
        new Person("Safaa", 30),
        new Person("Pamela", 27),
        new Person("David", 12));


    Integer ageSum = persons
      .stream()
      //we need to use a function to combine the results of the substreams into a single one. This is the role of the combiner
      .parallel() // combiner is working just in parallel streams
      .reduce(0,
        (sum, p) -> {
          System.out.format("accumulator: sum=%s; person=%s\n", sum, p);
          return sum += p.age;
        },
        (sum1, sum2) -> {
          System.out.format("combiner: sum1=%s; sum2=%s\n", sum1, sum2);
          return sum1 + sum2;
        });

    System.out.println(ageSum);

  }

}

class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return name;
  }
}
