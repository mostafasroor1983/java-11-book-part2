package two.executor;

import java.util.concurrent.*;

public class ExecutorServiceCallbackExample {
    public static void main(String[] args) {
        // Create an ExecutorService with a fixed thread pool of 2 threads
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Create a CompletableFuture representing the async computation
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 42, executorService);

        // Register a callback to be executed when the task is completed
        future.thenAccept(result -> System.out.println("Sum result: " + result));

        // Shutdown the ExecutorService
        executorService.shutdown();
    }

}