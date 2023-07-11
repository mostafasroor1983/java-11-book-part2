package two.executor;

import java.util.concurrent.*;

public class ScheduledExecutorServiceExample {
    public static void main(String[] args) {
        // Create a ScheduledExecutorService with a pool size of 1
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        // Schedule a task to run after a delay of 2 seconds
        ScheduledFuture<?> future = executor.schedule(new Task(), 2, TimeUnit.SECONDS);

        // Schedule a task to run repeatedly every 3 seconds, starting after an initial delay of 1 second
        executor.scheduleAtFixedRate(new RepeatedTask(), 1, 3, TimeUnit.SECONDS);

        // Wait for the first task to complete
        try {
            future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown the executor
        //executor.shutdown();
    }

    static class Task implements Runnable {
        @Override
        public void run() {
            System.out.println("Task executed after 2 seconds");
        }
    }

    static class RepeatedTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Repeated task executed");
        }
    }
}