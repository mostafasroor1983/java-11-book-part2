package four;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesMethodsExample5 {
    public static void main(String[] args) throws IOException {

        ///The first Files.copy method reads the contents of a stream and writes the output to a file.
        // The second method reads the contents of a file and writes the output to a stream.
        Path path = Path.of("files/testN.txt");
        try (var is = new FileInputStream("test2.txt")) {
            // Write stream data to a file, if path already exist =>FileAlreadyExistsException: files/testN.txt
            Files.copy(is, path);
        }

        //Prints the contents of a file directly to the System.out stream
        Files.copy(path, System.out);
    }
}
