package questions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Question12 {
    public static void takeNap() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //The awaitTermination() method waits a specified amount of time for all tasks to complete,
    // and the service to finish shutting down. Since each five-second task is still executing,
    // the awaitTermination() method will return with a value of false after two
    // seconds but not throw an exception.
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            service.execute(() -> takeNap());
            service.execute(() -> takeNap());
            service.execute(() -> takeNap());
        } finally {
            if (service != null) service.shutdown();
        }
        service.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println("DONE!");
    }
}
