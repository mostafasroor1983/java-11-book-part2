package four;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FilesMethodsExample12 {
    public static void main(String[] args) throws IOException {
       Path path = Path.of("test2.txt");

       // all the file lines in memory
        List<String> lines = Files.readAllLines(path);
        lines.forEach(System.out::println);
    }
}
