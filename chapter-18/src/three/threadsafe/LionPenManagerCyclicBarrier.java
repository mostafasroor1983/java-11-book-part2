package three.threadsafe;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LionPenManagerCyclicBarrier {
    private void removeLions() {
        System.out.println("Removing lions");
    }

    private void cleanPen() {
        System.out.println("Cleaning the pen");
    }

    private void addLions() {
        System.out.println("Adding lions");
    }

    public void performTask(CyclicBarrier c1, CyclicBarrier c2) throws BrokenBarrierException,
            InterruptedException {
        removeLions();
        c1.await();
        cleanPen();
        c2.await();
        addLions();
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            var manager = new LionPenManagerCyclicBarrier();
            var c1 = new CyclicBarrier(4);
            var c2 = new CyclicBarrier(4,
                    () -> System.out.println("*** Pen Cleaned!"));
            for (int i = 0; i < 4; i++)
                service.submit(() -> {
                    try {
                        manager.performTask(c1, c2);
                    } catch (BrokenBarrierException | InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });
        } finally {
            if (service != null) service.shutdown();
        }
    }
}