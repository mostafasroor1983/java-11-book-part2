package functionalInterfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class TestingOperator {
  public static void main(String[] args) {
    UnaryOperator<String> b6 = String::toLowerCase;
    System.out.println(b6.apply("MosTafa"));

    BinaryOperator<String> b5 = String::concat;
    System.out.println(b5.apply("Mostafa " , "Srour"));

  }
}
