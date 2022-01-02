package collections;

import compare.Duck;
import java.util.Set;
import java.util.TreeSet;

public class UseTreeSet {
  public static void main(String[] args) {
    Set<Duck> ducks = new TreeSet<>();
    ducks.add(new Duck("Puddles"));

    //Set<Rabbit> rabbits = new TreeSet<>();
    // rabbits.add(new Rabbit()); // ClassCastException, because Rabbit doesn't implements Comparable class

    Set<Rabbit> rabbits = new TreeSet<>((r1, r2) -> r1.id - r2.id);
    rabbits.add(new Rabbit());

  }

  static class Rabbit {
    int id;
  }
}