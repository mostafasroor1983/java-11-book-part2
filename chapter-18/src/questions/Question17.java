package questions;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
public class Question17 {
    public static void addAndPrintItems(BlockingQueue<Integer> queue) throws InterruptedException {
        queue.offer(103);
        queue.offer(20, 1, TimeUnit.SECONDS);
        queue.offer(85, 7, TimeUnit.HOURS);
        System.out.print(queue.poll(200, TimeUnit.NANOSECONDS));
        System.out.print(" " + queue.poll(1, TimeUnit.MINUTES));
    }

    public static void main(String[] args) throws InterruptedException {
        addAndPrintItems(new LinkedBlockingQueue<>());
    }
}
