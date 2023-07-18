package four;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesMethodsExample9 {
    public static void main(String[] args) throws IOException {
        //The Files class includes two methods that delete a file or
        //empty directory within the file system. delete(path), deleteIfExists(path)
        //To delete a directory, it must be empty.
        //Both of these methods throw an exception if operated on a nonempty directory

        //.DirectoryNotEmptyException: files
        //Files.delete(Paths.get("files"));
        Files.delete(Paths.get("files/testN.txt"));

        System.out.println(Files.deleteIfExists(Paths.get("files/testN.txt")));

    }
}
