package two.executor;

import java.util.concurrent.*;

public class ExecutorRunnableCallback {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println(Runtime.getRuntime().availableProcessors());
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> System.out.println("Hello Zoo");
        Callable<String> task2 = () -> "Monkey";
        ScheduledFuture<?> r1 = service.schedule(task1, 10, TimeUnit.SECONDS);
        ScheduledFuture<String> r2 = service.schedule(task2, 20, TimeUnit.SECONDS);

        r1.get();
        System.out.println(r2.get());
        service.shutdown();
    }
}
