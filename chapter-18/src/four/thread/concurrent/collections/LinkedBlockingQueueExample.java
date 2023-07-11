package four.thread.concurrent.collections;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class LinkedBlockingQueueExample {
    public static void main(String[] args) {
        try {
            var blockingQueue = new LinkedBlockingQueue<Integer>();
            blockingQueue.offer(39);
            blockingQueue.offer(3, 4, TimeUnit.SECONDS);
            System.out.println(blockingQueue.poll());
            System.out.println(blockingQueue.poll(1, TimeUnit.NANOSECONDS));
        } catch (InterruptedException e) {
            // Handle interruption
        }
    }
}
