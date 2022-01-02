package collections;

import java.util.Set;

public class SetFactoryMethods {
  public static void main(String[] args) {
    Set<Character> letters = Set.of('z', 'o', 'o');
    Set<Character> copy = Set.copyOf(letters);
  }
}
