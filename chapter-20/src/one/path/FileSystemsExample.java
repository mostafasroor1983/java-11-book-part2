package one.path;

import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.net.URI;
import java.util.Date;

public class FileSystemsExample {
    public static void main(String[] args) throws URISyntaxException {
        Path path1 = FileSystems.getDefault().getPath("test.txt");
        System.out.println(path1.getFileSystem());
        System.out.println(path1.getFileName());
        System.out.println(path1.isAbsolute());

        System.out.println("---------------");
        Path path4 =  FileSystems.getDefault().getPath("files/a.txt");
        System.out.println(path4.getFileSystem());
        System.out.println(path4.getFileName());
        System.out.println(path4.getParent());
        System.out.println(path4.isAbsolute());

        System.out.println("---------------");
        Path path5 =  FileSystems.getDefault().getPath("files", "b.txt");
        System.out.println(path5.getFileSystem());
        System.out.println(path5.getFileName());
        System.out.println(path5.getParent());
        System.out.println(path5.isAbsolute());

        System.out.println("---------------");
        Path path3 =  FileSystems.getDefault().getPath("/", "mostafasrour", "Desktop", "projects"
                , "github", "java-11-book-part2", "files", "c.txt");
        System.out.println(path3.getFileSystem());
        System.out.println(path3.getFileName());
        System.out.println(path3.getParent());
        System.out.println(path3.isAbsolute());
        File fil3 = path3.toFile();
        System.out.println(new Date(fil3.lastModified()));


        System.out.println("---------------");
        Path path7 = FileSystems.getDefault().getPath("/", "mostafasrour", "Desktop", "projects"
                , "github", "java-11-book-part2", "files", "c.txt");
        System.out.println(path7.getFileSystem());
        System.out.println(path7.getFileName());
        System.out.println(path7.getParent());
        System.out.println(path7.isAbsolute());
        File fil7 = path7.toFile();
        fil7.toPath();
        System.out.println(new Date(fil7.lastModified()));

        System.out.println("---------------");
        FileSystem fileSystem = FileSystems.getFileSystem(
                new URI("http://www.selikoff.net"));
        Path path = fileSystem.getPath("test.txt");
        System.out.println(path.getFileSystem());
        System.out.println(path.getFileName());
        System.out.println(path.getParent());
        System.out.println(path.isAbsolute());

    }
}
