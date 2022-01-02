package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestConcurrentModificationException {
  public static void main(String[] args) {
    //Collection<String> birds = new CopyOnWriteArrayList<>();
    Collection<String> birds = new ArrayList<>();
    birds.add("hawk");
    birds.add("hawk");
    birds.add("hawk");
    // ConcurrentModificationException
    for (String bird : birds) {
      birds.remove(bird);
    }
  }
}
