package five;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class StreamApiExample {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("files");
        Files.list(path).forEach(System.out::println);

        System.out.println("----------------------");
        //Please, in your own code, always use try‐with‐resources
        //statements with these NIO.2 methods.
        try(Stream<Path> stream = Files.list(path)){
            stream.forEach(System.out::println);
        }
    }
}
