package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class CollectionMethods {
  public static void main(String[] args) {
    Collection<String> birds = new ArrayList<>();
    System.out.println(birds.isEmpty()); // true
    System.out.println(birds.size());    // 0
    birds.add("hawk");                   // [hawk]
    birds.add("hawk");                   // [hawk, hawk]
    System.out.println(birds.isEmpty()); // false
    System.out.println(birds.size());    // 2

    //The clear() method provides an easy way to discard all
    //elements of the Collection.
    System.out.println("---------------------------------");
    Collection<String> birds2 = new ArrayList<>();
    birds2.add("hawk");                      // [hawk]
    birds2.add("hawk");                      // [hawk, hawk]
    System.out.println(birds2.isEmpty());    // false
    System.out.println(birds2.size());       // 2
    birds2.clear();                          // []
    System.out.println(birds2.isEmpty());    // true
    System.out.println(birds2.size());       // 0


    //The contains() method checks whether a certain value is in the Collection.
    System.out.println("---------------------------------");
    Collection<String> birds3 = new ArrayList<>();
    birds3.add("hawk");                           // [hawk]
    System.out.println(birds3.contains("hawk"));  // true
    System.out.println(birds3.contains("robin")); // false

    System.out.println("---------------------------------");
    var employees = new ArrayList<Employee>();
    employees.add(new Employee(1L, "a"));
    employees.add(new Employee(2L, "b"));
    employees.add(new Employee(3L, "c"));
    employees.add(new Employee(4L, "d"));
    System.out.println(employees.contains(new Employee(1L, "a"))); // true
    System.out.println(employees.contains(new Employee(2L, "c"))); // false

    System.out.println("---------------------------------");
    //The removeIf() method removes all elements that match a condition.
    employees.removeIf(e -> e.name.equals("a"));
    System.out.println(employees);
    Collection<String> list = new ArrayList<>();
    list.add("Magician");
    list.add("Assistant");
    System.out.println(list);           // [Magician, Assistant]
    list.removeIf(s -> s.startsWith("A"));
    System.out.println(list);           // [Magician]

    System.out.println("---------------------------------");
    Collection<String> set = new HashSet<>();
    set.add("Wand");
    set.add("");
    set.removeIf(String::isEmpty);    // s -> s.isEmpty()
    System.out.println(set);          // [Wand]

    //Foreach
    System.out.println("---------------------------------");
    Collection<String> cats = Arrays.asList("Annie", "Ripley");
    cats.forEach(System.out::println);
    cats.forEach(c -> System.out.println(c));

  }

  private static class Employee {
    private Long Id;
    private String name;

    public Employee(Long id, String name) {
      Id = id;
      this.name = name;
    }

    public Long getId() {
      return Id;
    }

    public void setId(Long id) {
      Id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
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

      if (!Id.equals(employee.Id)) {
        return false;
      }
      return name.equals(employee.name);
    }

    @Override
    public int hashCode() {
      int result = Id.hashCode();
      result = 31 * result + name.hashCode();
      return result;
    }

    @Override
    public String toString() {
      return "Employee{" +
        "Id=" + Id +
        ", name='" + name + '\'' +
        '}';
    }
  }


}
