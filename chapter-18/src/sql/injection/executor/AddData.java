package sql.injection.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AddData {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Integer> future = service.submit(() -> new Adder().add(10, 70));
        System.out.println("Adding 10,70 : " + future.get());
        if (service != null) service.shutdown();
    }

    static class Adder {
        int add(int a, int b) {
            return a + b;
        }
    }
}
