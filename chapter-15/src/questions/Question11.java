package questions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question11 {
  public static void main(String[] args) {
    String result = Stream.iterate(1, x -> ++x)
      .limit(5).map(x -> "" + x)
      .collect(Collectors.joining());
    System.out.println(result);
  }
}
