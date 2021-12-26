package lambda;

import java.util.function.Predicate;

public class Crow {
  private String color;

  public void caw(String name) {
    String volume = "loudly";
    // we can refer to instance variables, static variables or effectively final local variable
    Predicate<String> p = s -> (name + volume + color).length() == 10;
  }
}