package three.threadsafe;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.*;

public class SheepManager {
    private int sheepCount = 0;

    private void incrementAndReport() {
       // ++sheepCount;
        System.out.print((++sheepCount) + " ");
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        SheepManager manager = new SheepManager();
        System.out.println();
        System.out.println(LocalDateTime.now());
        try {
            service = Executors.newFixedThreadPool(20);
            for (int i = 0; i < 10; i++)
                service.submit(() -> manager.incrementAndReport());
        } finally {
            if (service != null) service.shutdown();
        }
        System.out.println();
        System.out.println(LocalDateTime.now());
        System.out.println(manager.sheepCount);
    }
}