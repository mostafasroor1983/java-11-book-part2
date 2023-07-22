package sql.injection.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceInvokeAllExample2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        System.out.println("begin");
        Callable<String> task = () -> "result";
        List<Future<String>> list = service.invokeAll(List.of(task, task, task));
        for (Future<String> future : list) {
            System.out.println(future.get());
        }
        System.out.println("end");
        service.shutdown();
    }
}