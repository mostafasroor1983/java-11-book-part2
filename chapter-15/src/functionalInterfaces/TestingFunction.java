package functionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class TestingFunction {
  public static void main(String[] args) {

    Function<String, String> b1 = String::toUpperCase;
    System.out.println(b1.apply("Mostafa"));
    Function<String, Integer> b2 = String::length;
    System.out.println(b2.apply("cluck")); // 5

    System.out.println("-------------------------------------");

    BiFunction<String, Integer, String> b3 = String::substring;
    System.out.println(b3.apply("Mostafa", 1));

    BiFunction<String, String, String> b4 = String::concat;
    System.out.println(b4.apply("Mostafa " , "Srour"));

    System.out.println("-------------------------------------");

    BinaryOperator<String> b5 = String::concat;
    System.out.println(b5.apply("Mostafa " , "Srour"));

    UnaryOperator<String> b6 = String::toLowerCase;
    System.out.println(b6.apply("MosTafa"));

  }
}
