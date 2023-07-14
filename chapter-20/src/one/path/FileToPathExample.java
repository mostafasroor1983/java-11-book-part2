package one.path;

import java.io.File;
import java.nio.file.Path;

public class FileToPathExample {
    public static void main(String[] args) {
        File file = new File("test.txt");
        Path path = file.toPath();
        File backToFile = path.toFile();

        System.out.println(path);
        System.out.println(backToFile);
    }
}
