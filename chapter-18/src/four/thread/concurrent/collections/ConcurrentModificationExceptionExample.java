package four.thread.concurrent.collections;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        //ConcurrentModificationException
        var foodData = new HashMap<String, Integer>();

        //var foodData = new ConcurrentHashMap<String, Integer>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for (String key : foodData.keySet())
            foodData.remove(key);
    }
}
