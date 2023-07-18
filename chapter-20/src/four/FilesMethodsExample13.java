package four;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FilesMethodsExample13 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("test2.txt");
        Path path2 = Path.of("test2333.txt");
        System.out.println("Is a regular file: " + Files.isRegularFile(path));
        System.out.println("Is a directory: " + Files.isDirectory(path));
        System.out.println("Is a symbolic link: " + Files.isSymbolicLink(path));
        System.out.println("Is Hidden: " + Files.isHidden(path));
        System.out.println("Is Readable: " + Files.isReadable(path));
        System.out.println("Is Writable: " + Files.isWritable(path));
        System.out.println("Is Executable: " + Files.isExecutable(path));

        System.out.println("----------------------");
        System.out.println("Is Hidden: " + Files.isHidden(path2));
        System.out.println("Is Readable: " + Files.isReadable(path2));
        System.out.println("Is Writable: " + Files.isWritable(path2));
        System.out.println("Is Executable: " + Files.isExecutable(path2));

        System.out.println("----------------------");
        //Files.size is applied only on files not on directories
        //if the path is not exist => NoSuchFileException
        System.out.println("Path Size: " + Files.size(path));
        System.out.println("Path2 Size: " + Files.size(path2)); //NoSuchFileException: test2333.txt


    }
}
