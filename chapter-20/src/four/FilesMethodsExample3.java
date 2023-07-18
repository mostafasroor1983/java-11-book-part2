package four;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMethodsExample3 {
    public static void main(String[] args) throws IOException {
        //The createDirectory(): will create a directory and throw an exception if it already exists or the paths
        //leading up to the directory do not exist.
        Files.createDirectory(Path.of("files/field"));

        //createDirectories(): creates the target directory along with any nonexistent parent directories
        // leading up to the path.
        //if the dirs already exist it will simply complete without doing anything.
        //This is useful in situations where you want to ensure a directory exists and
        //create it if it does not.
        Files.createDirectories(Path.of("bison/field/pasture/green"));

    }
}
