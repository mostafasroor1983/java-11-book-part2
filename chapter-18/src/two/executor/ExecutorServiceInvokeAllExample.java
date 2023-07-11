package two.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceInvokeAllExample {
    public static void main(String[] args) {
        // Create an ExecutorService with a fixed thread pool size
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Create a list of Callable tasks
        List<Callable<Integer>> tasks = new ArrayList<>();
        tasks.add(new Task("Task 1", 3));
        tasks.add(new Task("Task 2", 2));
        tasks.add(new Task("Task 3", 1));

        try {
            // Invoke all the tasks and get the results
            List<Future<Integer>> results = executor.invokeAll(tasks);

            // Process the results
            for (Future<Integer> result : results) {
                try {
                    Integer taskResult = result.get();
                    System.out.println("Task result: " + taskResult);
                } catch (ExecutionException e) {
                    System.out.println("Task execution exception: " + e.getMessage());
                }
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException occurred: " + e.getMessage());
        }

        // Shutdown the executor
        executor.shutdown();
    }

    static class Task implements Callable<Integer> {
        private String name;
        private int seconds;

        public Task(String name, int seconds) {
            this.name = name;
            this.seconds = seconds;
        }

        @Override
        public Integer call() throws Exception {
            System.out.println(name + " started");
            Thread.sleep(seconds * 1000);
            System.out.println(name + " completed");
            return seconds;
        }
    }
}