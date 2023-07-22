package command.injection.threadsafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockAndMonitorSheepManager {
    private static int counter;
    Object object = new Object();

    //following shows two implementations, one
    //with a synchronized block and one with a Lock instance.
    //As we'll see in the next section, the Lock solution has a number of
    //features not available to the synchronized block.
    public void printDaysWork() {
        synchronized (object) {
            System.out.print("Finished work");
        }
    }

    public void printDaysWork2() {
        Lock lockObject = new ReentrantLock();

        try {
            lockObject.lock();
            System.out.print("Finished work");
        } finally {
            lockObject.unlock();
        }
    }


    public static void main(String[] args) {
    }
}