package three;

import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class PathMethodsExample5 {


    public static void main(String[] args) throws URISyntaxException {
        Path p = Path.of("files/test.txt");
        System.out.println(p.resolve("a").resolve("b"));

        System.out.println("---------------------");
        Path p1 = Path.of("/");
        System.out.println(p1.resolve("a").resolve("b"));

        System.out.println("---------------------");
        Path p2 = FileSystems.getDefault().getPath("/", "Users", "mostafasrour", "Desktop",
                "projects", "gtihub", "java-11-book-part2", "test2.txt");
        System.out.println(p2.resolve("a").resolve("b"));

        System.out.println("---------------------");
        Path p3 = Path.of("/zoo/armadillo/shells.txt");
        System.out.println(p3.resolve("a").resolve("b"));

        System.out.println("---------------------");
        Path p4 = Path.of("./armadillo/../shells.txt");
        System.out.println(p4.resolve("a").resolve("b"));

        System.out.println("---------------------");
        System.out.println("p.resolve(p1):" + p.resolve(p1));
        System.out.println("p1.resolve(p):" + p1.resolve(p));
        System.out.println("p2.resolve(p3):" + p2.resolve(p3));
        System.out.println("p3.resolve(p4):" + p3.resolve(p4));

        Path path3 = Path.of("/turkey/food");
        //Since the input parameter path3 is an absolute path the output will be /tiger/cage
        System.out.println(path3.resolve("/tiger/cage"));

    }
}
