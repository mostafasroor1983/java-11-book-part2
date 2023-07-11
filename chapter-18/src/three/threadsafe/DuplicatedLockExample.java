package three.threadsafe;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DuplicatedLockExample {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        //For calls with tryLock(), you need to call unlock()
        //only if the method returned true.
        if (lock.tryLock()) {
            try {
                //It is critical that you release a lock the same number of times it is acquired.
                lock.lock();
                System.out.println("Lock obtained, entering protected code");
            } finally {
                lock.unlock();
            }
        }

        new Thread(() -> System.out.print(lock.tryLock())).start();
    }
}
