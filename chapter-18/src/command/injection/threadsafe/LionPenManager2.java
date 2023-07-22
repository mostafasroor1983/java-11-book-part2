package command.injection.threadsafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class LionPenManager2 {
    Lock lock = new ReentrantLock();

    private void removeLions() {
        System.out.println("Removing lions");
    }

    private void cleanPen() {
        System.out.println("Cleaning the pen");
    }

    private void addLions() {
        System.out.println("Adding lions");
    }

    public void performTask() {
        if (lock.tryLock()) {
            try {
                removeLions();
                cleanPen();
                addLions();
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            var manager = new LionPenManager2();
            for (int i = 0; i < 10; i++)
                service.submit(() -> manager.performTask());
        } finally {
            if (service != null) service.shutdown();
        }
    }
}