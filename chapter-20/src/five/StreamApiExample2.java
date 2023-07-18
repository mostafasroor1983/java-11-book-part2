package five;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class StreamApiExample2 {
    static void copyPath(Path source, Path target) {
        try {
            Files.copy(source, target);
            if (Files.isDirectory(source))
                try (Stream<Path> stream = Files.list(source)) {
                    stream.forEach(p -> {
                        Path fileName = p.getFileName();
                        System.out.println("fileName: " + fileName);
                        copyPath(p, target.resolve(fileName));
                    });
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        copyPath(Path.of("files"), Path.of("files-new"));
    }
}
