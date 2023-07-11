package four.thread.concurrent.collections;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetExample {
    public static void main(String[] args) {
        //The CopyOnWriteArraySet is used just like a HashSet
        Set<Character> favLetters = new CopyOnWriteArraySet<>(List.of('a', 't'));
        for (char c : favLetters) {
            System.out.print(c + " ");
            favLetters.add('s');
        }
        System.out.println();
        System.out.println("Size: " + favLetters.size());
    }
}
