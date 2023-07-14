package one.path;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class PathUriExample {
    public static void main(String[] args) throws URISyntaxException {
        Path path = Path.of(new URI("file:///Users/mostafasrour/Desktop/projects/github/java-11-book-part2/test.txt"));
        System.out.println(path.getFileName());

        Path path2 = Path.of(new URI("file:///files/a.txt"));
        System.out.println(path2.getFileName());

        Path path3 = Paths.get(new URI("file:///files/a.txt"));
        System.out.println(path3.getFileName());

        Path path4 = Paths.get(new URI("http://www.youtube.com/"));
        System.out.println(path4.isAbsolute());

    }
}
