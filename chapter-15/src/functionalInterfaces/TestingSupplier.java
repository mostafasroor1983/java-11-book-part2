package functionalInterfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class TestingSupplier {
  public static void main(String[] args) {
    //A Supplier is often used when constructing new objects.
    //You can create a LocalDate object using the factory method now().
    // constructing a new object of LocalDate using static method reference
    Supplier<LocalDate> s1 = LocalDate::now;
    Supplier<LocalDate> s2 = () -> LocalDate.now();
    LocalDate d1 = s1.get();
    LocalDate d2 = s2.get();
    System.out.println(d1);
    System.out.println(d2);

    System.out.println("----------------------------------------");
    // constructing a new object of StringBuilder using constructor reference
    Supplier<StringBuilder> s3 = StringBuilder::new;
    Supplier<StringBuilder> s4 = () -> new StringBuilder();
    System.out.println(s3.get().append("one"));
    System.out.println(s4.get().append("two"));

    System.out.println("----------------------------------------");
    // constructing a new object of ArrayList<String> using constructor reference
    Supplier<ArrayList<String>> s5 = ArrayList<String>::new;
    System.out.println(s5);
    ArrayList<String> a1 = s5.get();
    a1.add("a1");
    System.out.println(a1);
  }
}
