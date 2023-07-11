package two.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceInvokeAnyExample {
    public static void main(String[] args) {
        // Create an ExecutorService with a fixed thread pool size
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Create a list of Callable tasks
        List<Callable<Integer>> tasks = new ArrayList<>();
        tasks.add(new Task("Task 1", 1));
        tasks.add(new Task("Task 2", 2));
        tasks.add(new Task("Task 3", 3));

        try {
            // Invoke any task and get the result
            Integer result = executor.invokeAny(tasks);
            System.out.println("First completed task result: " + result);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException occurred: " + e.getMessage());
        } catch (ExecutionException e) {
            System.out.println("ExecutionException occurred: " + e.getMessage());
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