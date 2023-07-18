package four;

import java.io.IOException;
import java.net.StandardSocketOptions;
import java.nio.file.*;

public class FilesMethodsExample4 {
    public static void main(String[] args) throws IOException {
        //The method copies a file or directory from one location to another using Path objects
        // if files/c already exist => FileAlreadyExistException
        // if files/b not exists    => NoSuchFileException
        //Files.copy(Paths.get("files/b"), Paths.get("files/c"));

        // if files/c already exist => it will replace the existing one
        // if files/b not exists    => NoSuchFileException
        // shallow copy just the directory without the files included
        Files.copy(Paths.get("files/b"), Paths.get("files/c"), StandardCopyOption.REPLACE_EXISTING);


        //Files.copy(Paths.get("files/a/1.txt"), Paths.get("files/c/3.txt"), StandardCopyOption.REPLACE_EXISTING);

    }
}
