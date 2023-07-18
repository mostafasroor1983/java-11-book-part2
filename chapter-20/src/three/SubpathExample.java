package three;

import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.sql.SQLOutput;

public class SubpathExample {

    static void printCountNames(Path path) {
        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.printf("Element %d is : %s", i, path.getName(i));
            System.out.println("");
        }
    }

    public static void main(String[] args) throws URISyntaxException {
        Path path2 = FileSystems.getDefault().getPath("/", "Users", "mostafasrour", "Desktop",
                "projects", "gtihub", "java-11-book-part2", "test2.txt");
        System.out.println("The path name is: " + path2);

        System.out.println("---------------------");
        //subpath: The references are inclusive of the beginIndex, and exclusive of the endIndex.
        Path subpath = path2.subpath(0, path2.getNameCount() - 1);
        System.out.println("The subpath name is: " + subpath);
        printCountNames(subpath);

        System.out.println("---------------------");
        System.out.println("subpath(0,3): " + path2.subpath(0, 3));
        System.out.println("subpath(1,2): " + path2.subpath(1, 2));
        System.out.println("subpath(1,3): " + path2.subpath(1, 3));

        //IllegalArgumentException
        System.out.println("subpath(1,13): " + path2.subpath(1, 13));
        System.out.println("subpath(1,1): " + path2.subpath(1, 1));
    }
}
