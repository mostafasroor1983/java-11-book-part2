package four.thread.concurrent.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class SynchronizedHashMapExample {
    public static void main(String[] args) {
        var foodData = new HashMap<String, Object>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        //Unlike the concurrent collections, the synchronized collections
        //also throw an exception if they are modified within an iterator
        //by a single thread.

        //Other than iterating over the collection, the objects returned are safe from
        // memory consistency errors and can be used among multiple threads.
        // synFoodData object can be used among multiple threads.
        var synFoodData = Collections.synchronizedMap(foodData);
        for(String key: synFoodData.keySet())
            synFoodData.remove(key);
    }
}
