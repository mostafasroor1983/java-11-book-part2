package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortRabbits {
    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit());
        //Collections.sort(rabbits); // DOES NOT COMPILE, because Rabbit should implement Comparable to allow sort
        // we can use Comparator without implementing Comparable
        Collections.sort(rabbits, (r1, r2) -> r1.id - r2.id);
    }

    static class Rabbit {
        int id;
    }
}