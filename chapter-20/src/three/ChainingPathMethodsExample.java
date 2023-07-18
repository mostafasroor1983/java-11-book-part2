package three;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.*;

public class ChainingPathMethodsExample {
    public static void main(String[] args) throws URISyntaxException {
        URI baseUri = URI.create("file:///Users/mostafasrour/Desktop/projects/gtihub/java-11-book-part2/");

        Path path = Path.of(baseUri.resolve("files")).getParent().getParent().normalize().toAbsolutePath();
        Path path2 = Path.of("/home/mostafasrour/Desktop").getParent().normalize().toAbsolutePath();
        Path path3 = Path.of("test2.txt").toAbsolutePath().getParent().normalize();
        Path path4 = Path.of(baseUri.resolve("test2.txt")).getParent().normalize();

        URI uri5 = URI.create("file:///Users/mostafasrour/Desktop/projects/gtihub/java-11-book-part2/zoo.log");
        Path path5 = Paths.get(uri5);
        Path path6 = Path.of("test2.txt");
        Path path7 = FileSystems.getDefault().getPath("/","Users", "mostafasrour", "Desktop", "projects"
                , "gtihub", "java-11-book-part2", "test2.txt");


        System.out.println(path);
        System.out.println(path2);
        System.out.println(path3);
        System.out.println(path4);
        System.out.println(path5);
        System.out.println(Files.exists(path5, LinkOption.NOFOLLOW_LINKS));
        System.out.println(Files.exists(path6, LinkOption.NOFOLLOW_LINKS));
        System.out.println(Files.exists(path7, LinkOption.NOFOLLOW_LINKS));
    }
}
