package sql.injection;

import java.io.IOException;
import java.nio.file.*;

public class FilesExample2 {

    static void copy(Path source, Path target) throws IOException {
        // move file as atomic
        Files.move(source, target, LinkOption.NOFOLLOW_LINKS, StandardCopyOption.ATOMIC_MOVE);
    }

    static void copy2(Path source, Path target) throws IOException {
        // copy existing attributes to the new file
        Files.move(source, target, LinkOption.NOFOLLOW_LINKS, StandardCopyOption.COPY_ATTRIBUTES);
    }

    static void copy3(Path source, Path target) throws IOException {
        // override file if it already exists
        Files.move(source, target, LinkOption.NOFOLLOW_LINKS, StandardCopyOption.REPLACE_EXISTING);
    }

    public static void main(String[] args) throws IOException {
        copy(Path.of("test.txt"), Path.of("files", "test.txt"));
        //copy2(Path.of("test2.txt"), Path.of("files", "test2.txt"));
        //copy3(Path.of("test3.txt"), Path.of("files", "test3.txt"));
    }
}
