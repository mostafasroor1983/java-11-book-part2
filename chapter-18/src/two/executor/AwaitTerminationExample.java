package two.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            service.submit(() -> System.out.println("Task 1"));
            service.submit(() -> System.out.println("Task 2"));
            service.submit(() -> System.out.println("Task 3"));
            service.submit(() -> System.out.println("Task 4"));
            service.submit(() -> System.out.println("Task 5"));
            service.submit(() -> System.out.println("Task 6"));
            service.submit(() -> System.out.println("Task 7"));
            service.submit(() -> System.out.println("Task 8"));
            service.submit(() -> System.out.println("Task 9"));
            // Add tasks to the thread executor
        } finally {
            if (service != null) service.shutdown();
        }
        if (service != null) {
            service.awaitTermination(1, TimeUnit.SECONDS);

            // Check whether all tasks are finished
            if (service.isTerminated())
                System.out.println("Finished!");
            else System.out.println("At least one task is still running");
        }
    }
}
