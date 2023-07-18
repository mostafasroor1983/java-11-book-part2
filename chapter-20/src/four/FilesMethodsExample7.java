package four;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesMethodsExample7 {
    public static void main(String[] args) throws IOException {
        //The first example renames the files directory to a files-new
        //directory, keeping all of the original contents from the source directory.
        Files.move(Path.of("files"), Path.of("files-new"));
        Files.move(Path.of("files-new"), Path.of("files"));

        //FileAlreadyExistsException: files
        //Files.move(Path.of("zoo.log"),Path.of("files"));

        //Like copy(), move() requires REPLACE_EXISTING to overwrite the
        //target if it exists, else it will throw an exception. Also like
        //copy(), move() will not put a file in a directory if the source is a
        //file and the target is a directory. Instead, it will create a new file
        //with the name of the directory.
        Files.move(Path.of("zoo.log"),Path.of("files/zoo.log"), StandardCopyOption.REPLACE_EXISTING);
        Files.move(Path.of("files/zoo.log"),Path.of("zoo.log"));
    }
}
