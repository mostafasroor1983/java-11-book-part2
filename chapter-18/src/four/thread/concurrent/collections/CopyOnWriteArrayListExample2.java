package four.thread.concurrent.collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample2 {
    public static void main(String[] args) {
        List<String> birds = new CopyOnWriteArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        birds.add("hawk");
        for (String bird : birds)
            birds.remove(bird);
        System.out.print(birds.size()); // 0
    }
}
