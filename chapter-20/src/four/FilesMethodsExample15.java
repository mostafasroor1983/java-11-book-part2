package four;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

public class FilesMethodsExample15 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("test2.txt");
        BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("Is a directory? " + data.isDirectory());
        System.out.println("Is a regular file? " + data.isRegularFile());
        System.out.println("Is a symbolic link? " + data.isSymbolicLink());
        System.out.println("Size (in bytes): " + data.size());
        System.out.println("Last modified: " + data.lastModifiedTime());

        System.out.println("--------------------------------");
        PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println("Is a directory? " + posixFileAttributes.isDirectory());
        System.out.println("Is a regular file? " + posixFileAttributes.isRegularFile());
        System.out.println("Is a symbolic link? " + posixFileAttributes.isSymbolicLink());
        System.out.println("Size (in bytes): " + posixFileAttributes.size());
        System.out.println("Last modified: " + posixFileAttributes.lastModifiedTime());

    }
}
