package ddos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class DdosExample1 {

    //Hacker Harry likes this method. He can call it in a loop. Since
    //the method opens a file system resource and never closes it,
    //there is a resource leak. After Hacker Harry calls the method enough times,
    //the program crashes because there are no more file handles available.
    public long countLines(Path path) throws IOException {
        return Files.lines(path).count();
    }

    //Security Sienna fixes the code by using the try‐with‐resources statement
    public long fixedCountLines(Path path) throws IOException {
        try (Stream<String> stream = Files.lines(path)) {
            return stream.count();
        }
    }

    public static void main(String[] args) {

    }
}
