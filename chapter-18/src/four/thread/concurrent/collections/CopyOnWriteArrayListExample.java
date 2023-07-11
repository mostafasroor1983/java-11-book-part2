package four.thread.concurrent.collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        //CopyOnWriteArrayList is particularly useful in multithreaded environments that need to
        //iterate the collection.
        //Any iterator established prior to a modification will not see the changes, but instead it will iterate
        //over the original elements prior to the modification.
        List<Integer> favNumbers = new CopyOnWriteArrayList<>(List.of(4, 3, 42));
        for (var n : favNumbers) {
            System.out.print(n + " ");
            favNumbers.add(9);
        }
        System.out.println();
        System.out.println("Size: " + favNumbers.size());
    }
}
