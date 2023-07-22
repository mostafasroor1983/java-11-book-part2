package command.injection;

import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class PathMethodsExample4 {

    static void printInfo(Path path) {
        System.out.println("Path:" + path);
        System.out.println("Absolute Path :" + path.toAbsolutePath());
        System.out.println("Absolute Path Is Absolute :" + path.toAbsolutePath().isAbsolute());

    }

    public static void main(String[] args) throws URISyntaxException {
        //if it started with / java consider as absolute path otherwise relative path.

        //The current working directory that toAbsolutePath depends on to build the absolute path
        System.out.println("Current Directory:" + System.getProperty("user.dir"));

        System.out.println("---------------------");
        Path p = Path.of("files/test.txt");
        printInfo(p);

        System.out.println("---------------------");
        Path p1 = Path.of("/");
        printInfo(p1);

        System.out.println("---------------------");
        Path p2 = FileSystems.getDefault().getPath("/", "Users", "mostafasrour", "Desktop",
                "projects", "gtihub", "java-11-book-part2", "test2.txt");
        printInfo(p2);

        System.out.println("---------------------");
        Path p3 = Path.of("/zoo/armadillo/shells.txt");
        printInfo(p3);

        System.out.println("---------------------");
        Path p4 = Path.of("./armadillo/../shells.txt");
        printInfo(p4);

    }
}
