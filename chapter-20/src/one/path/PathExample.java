package one.path;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class PathExample {
    public static void main(String[] args) {
        Path path1 = Path.of("test.txt");
        System.out.println(path1.getFileSystem());
        System.out.println(path1.getFileName());
        System.out.println(path1.isAbsolute());

        System.out.println("---------------");
        Path path4 = Path.of("files/a.txt");
        System.out.println(path4.getFileSystem());
        System.out.println(path4.getFileName());
        System.out.println(path4.getParent());
        System.out.println(path4.isAbsolute());

        System.out.println("---------------");
        Path path5 = Path.of("files", "b.txt");
        System.out.println(path5.getFileSystem());
        System.out.println(path5.getFileName());
        System.out.println(path5.getParent());
        System.out.println(path5.isAbsolute());

        System.out.println("---------------");
        Path path3 = Path.of("/", "mostafasrour", "Desktop", "projects"
                , "github", "java-11-book-part2", "files", "c.txt");
        System.out.println(path3.getFileSystem());
        System.out.println(path3.getFileName());
        System.out.println(path3.getParent());
        System.out.println(path3.isAbsolute());
        File fil3 = path3.toFile();
        System.out.println(new Date(fil3.lastModified()));


        System.out.println("---------------");
        Path path7 = Paths.get("/", "mostafasrour", "Desktop", "projects"
                , "github", "java-11-book-part2", "files", "c.txt");
        System.out.println(path7.getFileSystem());
        System.out.println(path7.getFileName());
        System.out.println(path7.getParent());
        System.out.println(path7.isAbsolute());
        File fil7 = path7.toFile();
        System.out.println(new Date(fil7.lastModified()));

    }
}
