package three;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.*;

public class PathMethodsExample {

    static void printCountNames(Path path) {
        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.printf("Element %d is : %s", i, path.getName(i));
            System.out.println("");
        }
    }

    public static void main(String[] args) throws URISyntaxException {
        URI baseUri = URI.create("file:///Users/mostafasrour/Desktop/projects/gtihub/java-11-book-part2/");

        Path path = Path.of(baseUri.resolve("files"));
        System.out.println(path);
        System.out.println(path.getName(0));
        System.out.println(path.getName(path.getNameCount() - 1));
        System.out.println(path.getNameCount());

        System.out.println("---------------");
        Path path2 = FileSystems.getDefault().getPath("/", "Users", "mostafasrour", "Desktop",
                "projects", "gtihub", "java-11-book-part2", "test2.txt");
        System.out.println("The path name is: " + path2);

        //retrieve the number of elements in the path and a reference to each element,
        System.out.println("Name elements count: " + path2.getNameCount());
        printCountNames(path2);

        //Even though this is an absolute path, the root element is not
        //included in the list of names. As we said, these methods do not
        //consider the root as part of the path.
        var p = Path.of("/");
        System.out.println(p.getNameCount());       // 0
        System.out.println(p.getName(0));     // IllegalArgumentException
    }
}
