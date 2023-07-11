package questions;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question15 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var cats = Stream.of("leopard", "lynx", "ocelot", "puma").parallel();
        var bears = Stream.of("panda", "grizzly", "polar").parallel();
        var data = Stream.of(cats, bears)
                .flatMap(s -> s)
                .collect(Collectors.groupingByConcurrent(s -> !s.startsWith("p")));
        System.out.println(data.get(false).size()
                + " " + data.get(true).size());
    }
}
