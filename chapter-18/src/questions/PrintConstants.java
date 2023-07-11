package questions;

import java.util.concurrent.*;
import java.util.stream.*;

public class PrintConstants {
    public static void main(String[] args) {

        //Even though the stream is processed in sequential order, the tasks are submitted
        // to a thread executor,which may complete the tasks in any order.
        // Therefore, the output cannot be determined ahead of time, and option F is correct.
        // Finally, the thread executor is never shut down; therefore, the code will run but
        // it will never terminate, making option H also correct.
        var s = Executors.newScheduledThreadPool(10);
        DoubleStream.of(3.14159, 2.71828) // b1
                .forEach(c -> s.submit( // b2
                        () -> System.out.println(10 * c))); // b3
        s.execute(() -> System.out.println("Printed"));
// b4
    }
}