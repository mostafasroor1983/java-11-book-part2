package four;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMethodsExample14 {
    public static void main(String[] args) throws IOException {
        //retrieve the last time a file was modified.
        Path path = Path.of("test2.txt");
        Path path2 = Path.of("test2222.txt");
        System.out.println(Files.getLastModifiedTime(path));
        System.out.println(Files.getLastModifiedTime(path2));//NoSuchFileException: test2222.txt
    }
}
