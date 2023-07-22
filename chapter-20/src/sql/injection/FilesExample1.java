package sql.injection;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample1 {
    public static void main(String[] args) {
        Path path = Paths.get("test.txt");
        boolean exists = Files.exists(path, LinkOption.NOFOLLOW_LINKS); // don't follow symbolic link
        System.out.println("exists : " + exists);
    }
}
