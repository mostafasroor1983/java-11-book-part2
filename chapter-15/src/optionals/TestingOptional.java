package optionals;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

public class TestingOptional {
  public static void main(String[] args) throws IllegalAccessException {
    System.out.println(checkNullability("mostafa"));
    System.out.println(checkNullability(null));

    System.out.println("---------------------------------------");
    System.out.println(average(100, 90));
    System.out.println(average());

    System.out.println("---------------------------------------");
    //System.out.println(average().get()); //NoSuchElementException
    average(80, 90).ifPresent(System.out::println);
    average().ifPresent(System.out::println);

    System.out.println("---------------------------------------");
    if (average().isPresent()) {
      System.out.println(average().get());
    }

    System.out.println("---------------------------------------");
    System.out.println(average().orElse(Double.NaN));
    System.out.println(average().orElseGet(Math::random));
    // throw the exception NoSuchElementException
    // System.out.println(average().orElseThrow()); // throw NoSuchElementException
    // throw customized exception
    // System.out.println(average().orElseThrow(IllegalAccessException::new));

    System.out.println("---------------------------------------");
    Optional<Double> opt = average(70, 80);
    System.out.println(opt.orElse(Double.NaN));
    System.out.println(opt.orElseGet(() -> Math.random()));
    System.out.println(opt.orElseThrow());

  }

  public static Optional<Double> average(int... scores) {
    if (scores.length == 0) {
      return Optional.empty();
    }
    int sum = 0;
    for (int score : scores) {
      sum += score;
    }
    return Optional.of((double) sum / scores.length);

  }

  public static OptionalDouble average2(int... scores) {
    return Arrays.stream(scores).average();
  }

  static Optional<String> checkNullability(String value) {
    //Optional o =  Optional.ofNullable(value);
    Optional o = (value == null) ? Optional.empty() : Optional.of(value);
    return o;
  }
}
