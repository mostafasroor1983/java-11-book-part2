package three;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class PathMethodsExample2 {

    public static void main(String[] args) throws URISyntaxException {
        Path p = Path.of("files/test.txt");
        System.out.println("parent:" + p.getParent());
        System.out.println("file name:" + p.getFileName());
        System.out.println("root:" + p.getRoot());

        System.out.println("---------------------");
        Path p1 = Path.of("/");
        System.out.println("parent:" + p1.getParent());
        System.out.println("file name:" + p1.getFileName());
        System.out.println("root:" + p1.getRoot());

        System.out.println("---------------------");
        Path p2 = FileSystems.getDefault().getPath("/", "Users", "mostafasrour", "Desktop",
                "projects", "gtihub", "java-11-book-part2", "test2.txt");
        System.out.println("parent:" + p2.getParent());
        System.out.println("file name:" + p2.getFileName());
        System.out.println("root:" + p2.getRoot());
    }
}
