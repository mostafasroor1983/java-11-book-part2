package command.injection.threadsafe;

import java.util.concurrent.ExecutorService;

public class StaticMonitorSheepManager {
    private static int counter;

    //For example, the following two methods are equivalent for synchronization inside our class.
    //You can use static synchronization if you need to order thread access across all
    //instances, rather than a single instance.
    public static void printDaysWork2() {
        synchronized(SheepManager.class) {
            System.out.print("Finished work");
        }
    }
    public static synchronized void printDaysWork() {
        System.out.print("Finished work");
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        StaticMonitorSheepManager manager = new StaticMonitorSheepManager();

    }
}