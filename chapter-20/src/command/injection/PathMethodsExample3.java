package command.injection;

import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class PathMethodsExample3 {

    static void printPathInformation(Path path) {
        System.out.println("Filename is: " + path.getFileName());
        System.out.println(" Root is: " + path.getRoot());
        Path currentParent = path;
        while ((currentParent = currentParent.getParent()) != null) {
            System.out.println(" Current parent is: " + currentParent);
        }
    }

    public static void main(String[] args) throws URISyntaxException {
        Path p = Path.of("files/test.txt");
        printPathInformation(p);

        System.out.println("---------------------");
        printPathInformation(p.toAbsolutePath());

        System.out.println("---------------------");
        Path p1 = Path.of("/");
        printPathInformation(p1);

        System.out.println("---------------------");
        Path p2 = FileSystems.getDefault().getPath("/", "Users", "mostafasrour", "Desktop",
                "projects", "gtihub", "java-11-book-part2", "test2.txt");
        printPathInformation(p2);

        System.out.println("---------------------");
        printPathInformation(Path.of("/zoo/armadillo/shells.txt"));

        System.out.println("---------------------");
        printPathInformation(Path.of("./armadillo/../shells.txt"));
    }
}
