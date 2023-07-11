package two.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceCallbackExample1 {
    public static void main(String[] args) throws ExecutionException,
            InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> future = executorService.submit(() -> 100);

        System.out.println("The result : " + future.get());
        if (executorService != null)
            executorService.shutdown();
    }
}
