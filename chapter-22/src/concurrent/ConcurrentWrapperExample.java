package concurrent;

//In Java, wrapper classes such as Integer, Double, Boolean, etc., are immutable,
// meaning their state cannot be changed after they are created.
// Since they are immutable,concurrent access to these objects does not require synchronization.
// Let's demonstrate this with an example using the Integer class:

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentWrapperExample {
    public static void main(String[] args) {
        final int numTasks = 5;
        ExecutorService executor = Executors.newFixedThreadPool(numTasks);

        // Shared immutable Integer object
        Integer sharedInteger = Integer.valueOf(0);

        for (int i = 0; i < numTasks; i++) {
            int taskNumber = i + 1;
            Runnable task = new IntegerTask(taskNumber, sharedInteger);
            executor.execute(task);
        }

        executor.shutdown();
    }
}

class IntegerTask implements Runnable {
    private int taskNumber;
    private Integer sharedInteger;

    public IntegerTask(int taskNumber, Integer sharedInteger) {
        this.taskNumber = taskNumber;
        this.sharedInteger = sharedInteger;
    }

    @Override
    public void run() {
        // Create a new Integer based on the current task number (immutable)
        Integer newInteger = Integer.valueOf(taskNumber);

        // Perform some computation using the shared and new Integer
        Integer result = sharedInteger + newInteger;

        // Update the sharedInteger reference with the new value (immutable)
        sharedInteger = result;

        // Print the result
        System.out.println("Task " + taskNumber + " Result: " + result);
    }
}