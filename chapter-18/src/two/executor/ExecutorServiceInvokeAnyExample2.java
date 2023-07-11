package two.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceInvokeAnyExample2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        System.out.println("begin");
        Callable<String> task = () -> "result";
        String data = service.invokeAny(List.of(task, task, task));
        System.out.println(data);
        System.out.println("end");
        service.shutdown();
    }
}