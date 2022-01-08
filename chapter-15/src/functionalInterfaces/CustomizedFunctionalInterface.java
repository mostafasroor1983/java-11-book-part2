package functionalInterfaces;

import java.util.List;
import java.util.stream.Collectors;

public class CustomizedFunctionalInterface {

  public static void main(String[] args) {
    TriFunction<String, String, String, List<String>> triFunction1 = List::of;
    System.out.println(triFunction1.apply("A", "B", "C"));

    TriFunction<String, String, String, String> triFunction2 = String::replace;
    System.out.println(triFunction2.apply("Aostafa", "A", "M"));

    TriFunction<String, Integer, Integer, String> triFunction3 = String::substring;
    System.out.println(triFunction3.apply("Mostafa", 1, 3));

    String s = triFunction1.apply("A", "B", "C")
      .stream()
      .map(StringBuilder::new)
      .collect(Collectors.joining(","));
  }

  @FunctionalInterface
  interface TriFunction<T, X, Y, R> {
    R apply(T t, X x, Y y);
  }
}
