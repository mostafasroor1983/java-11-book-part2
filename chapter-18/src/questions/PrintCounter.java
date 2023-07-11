package questions;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class PrintCounter {
    static int count = 0;

    public static void main(String[] args) throws
            InterruptedException,
            ExecutionException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            var r = new ArrayList<Future<?>>();
            IntStream.iterate(0, i -> i + 1)
                     .limit(5)
                     .forEach(i -> r.add(service.submit(() -> {count++; })) // n1
            );
            for (Future<?> result : r) {
                System.out.print(result.get() + " "); // n2
            }
        } finally {
            if (service != null) service.shutdown();
        }
    }}