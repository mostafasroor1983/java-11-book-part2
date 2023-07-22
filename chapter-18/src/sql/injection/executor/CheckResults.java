package sql.injection.executor;

import java.util.concurrent.*;

public class CheckResults {
    private static int counter = 0;

    public static void main(String[] unused) throws Exception {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();

            Future<String> future = service.submit(() -> {
                for (int i = 0; i < 500; i++)
                    CheckResults.counter++;
                return "Reached!";
            });

            //it will wait 10 seconds at max, if no result it will throw TimeoutException
            String result = future.get(10, TimeUnit.SECONDS);

            //endlessly wait until get the result
            //String result = future.get();
            System.out.println(result);
        } catch (TimeoutException e) {
            System.out.println("Not reached in time");
        } finally {
            if (service != null) service.shutdown();
        }
    }
}