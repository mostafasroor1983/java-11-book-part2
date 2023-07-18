package three;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMethodsExample8 {
    public static void main(String[] args) throws IOException {
        //toRealPath() is similar to normalize(), in that it eliminates any
        //redundant path symbols. It is also similar to toAbsolutePath(),
        //in that it will join the path with the current working directory if the path is relative.
        Path path5 = Paths.get("/", "Users", "mostafasrour", "Desktop",
                "projects", "gtihub", "java-11-book-part2").toRealPath(LinkOption.NOFOLLOW_LINKS);
        System.out.println(path5);

        Path path6 = Paths.get("/", "Users", "mostafasrour", "Desktop",
                "projects").toRealPath(LinkOption.NOFOLLOW_LINKS);
        System.out.println(path6);

        System.out.println(Path.of("zoo.log").toRealPath());
        System.out.println(Path.of("files/.././zoo.log").toRealPath());
        System.out.println(Path.of("files/../zoo.log").toRealPath());
        System.out.println(Path.of("files/test.txt").toRealPath());

        ///We can also use the toRealPath() method to gain access to the current working directory as a Path object.
        System.out.println(Paths.get(".").toRealPath());
    }
}
