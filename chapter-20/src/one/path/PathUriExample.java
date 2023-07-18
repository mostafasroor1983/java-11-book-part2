package one.path;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class PathUriExample {
    public static void main(String[] args) throws URISyntaxException {
        URI baseUri = URI.create("file:///Users/mostafasrour/Desktop/projects/gtihub/java-11-book-part2/");

        Path path = Path.of(new URI("file:///Users/mostafasrour/Desktop/projects/gtihub/java-11-book-part2/test.txt"));
        System.out.println(path.getFileName());
        System.out.println(Files.exists(path));

        System.out.println("---------------");
        Path path2 = Path.of(baseUri.resolve("files/a/1.txt"));
        System.out.println(path2.getFileName());
        System.out.println(Files.exists(path2));

        System.out.println("---------------");
        Path path3 = Paths.get(new URI("file:///files/b/2.txt"));
        System.out.println(path3.getFileName());
        System.out.println(Files.exists(path3));

        System.out.println("---------------");
        Path path4 = Paths.get(new URI("http://www.youtube.com/"));
        System.out.println(path4.isAbsolute());
        System.out.println(Files.exists(path4));

    }
}
