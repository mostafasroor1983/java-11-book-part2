package questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Question20 {
    public static void main(String[] args) throws IOException {
        //The normalize() method does not convert a relative path into an
        //absolute path; therefore, the path value after the first line is just the current directory symbol.
        final Path path = Paths.get(".");
        //final Path path = Paths.get(".").toAbsolutePath();
        System.out.println(path);
        int count = 0;
        for (int i = 0; i < path.getNameCount(); ++i) {
            count++;
        }
        System.out.println(count);
    }
}
