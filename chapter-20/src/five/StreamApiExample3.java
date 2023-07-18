package five;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class StreamApiExample3 {


    public static void main(String[] args) throws IOException {
        Path path = Path.of("files");
        try (Stream<Path> stream = Files.walk(path, 10, FileVisitOption.FOLLOW_LINKS)) {
            stream.forEach(System.out::println);
        }
    }
}
