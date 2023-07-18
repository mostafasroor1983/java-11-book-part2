package five;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class StreamApiExample4 {
    static long getSize(Path p) {
        try {
            return Files.size(p);
        } catch (IOException e) {
            // Handle exception
        }
        return 0L;
    }

    static long getPathSize(Path path) throws IOException {
        //The walk() method is different in that it does not follow
        //symbolic links by default and requires the FOLLOW_LINKS option to be enabled
        try (Stream<Path> stream = Files.walk(path, 10, FileVisitOption.FOLLOW_LINKS)) {
            return stream.parallel()
                    .peek(System.out::println)
                    .filter(p -> !Files.isDirectory(p))
                    .mapToLong(StreamApiExample4::getSize)
                    .sum();
        }
    }

    public static void main(String[] args) throws IOException {
        Path path = Path.of("files");
        float pathSize = getPathSize(path);
        System.out.format("The size of files in 'files' directory is: %.2f MB ",
                pathSize / 1000000);
    }
}
