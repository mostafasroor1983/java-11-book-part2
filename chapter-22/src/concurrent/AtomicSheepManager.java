package concurrent;


import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AtomicSheepManager {
    private static Integer anInt = Integer.valueOf(0);

    private void incrementAndReport() {
        System.out.print(anInt++ + " ");;
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        AtomicSheepManager manager = new AtomicSheepManager();
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
        System.out.println(anInt);
    }
}