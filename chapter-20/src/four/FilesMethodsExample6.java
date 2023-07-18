package four;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesMethodsExample6 {
    public static void main(String[] args) throws IOException {
        var file = Paths.get("test2.txt");
        var directory = Paths.get("files");
        var directory5 = Paths.get("files-new2");
        Files.copy(directory, directory5); // copy just the directory without the included files

        //It will throw FileAlreadyExistsException: files is already exists.
        //The command tries to create a new file, named /enclosure. Since
        //the path /enclosure already exists, an exception is thrown at runtime.
        //Files.copy(file, directory);

        //This is the right way to copy file inside directory
        var directory2 = Paths.get("files/test2.txt");
        Files.copy(file, directory2);

        var directory3 = directory.resolve(file.getFileName());
        //var directory3 = directory.resolve("test22.txt");
        Files.copy(file, directory3);
    }
}
