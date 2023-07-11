package three.threadsafe;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class MonitorSheepManager {
    private static int counter;
    Object object = new Object();

    private synchronized void incrementAndReport() {
        System.out.print(++counter + " ");
    }

    private void incrementAndReport2() {
        synchronized (this) {
            System.out.print(++counter + " ");
        }
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        MonitorSheepManager manager = new MonitorSheepManager();
        System.out.println();
        System.out.println(LocalDateTime.now());
        try {
            service = Executors.newFixedThreadPool(20);
            for (int i = 0; i < 10; i++)
                service.submit(() -> manager.incrementAndReport2());
        } finally {
            if (service != null) service.shutdown();
        }

        System.out.println();
        System.out.println(LocalDateTime.now());
    }
}