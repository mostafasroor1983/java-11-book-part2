package wrappers;

import java.util.ArrayList;
import java.util.List;

public class Testing {
  public static void main(String[] args) {
    Byte b = Byte.valueOf((byte) 1);
    Integer pounds = 120;                 //autoboxing
    Character letter = "robot".charAt(0); //autoboxing
    char r = letter;                      //unboxing

    var heights = new ArrayList<Integer>();
    heights.add(null);
    //int h = heights.get(0); //Unboxing, NullPointerException
    Integer h = heights.get(0);
    System.out.println(h);


    List<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(Integer.valueOf(3));
    numbers.add(Integer.valueOf(5));
    numbers.remove(1);
    numbers.remove(Integer.valueOf(5));
    System.out.println(numbers);

  }
}
