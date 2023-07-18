package five;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class StreamApiExample33 {
    static void copyPath(Path source, Path target) throws IOException {
        try (Stream<Path> stream = Files.walk(source, 10, FileVisitOption.FOLLOW_LINKS)) {

            stream.forEach(pth -> {
                String replaced = pth.toString().replace(source.getName(0).toString(),
                        target.getName(0).toString());
                System.out.println("replaced : " + replaced);
                Path trgt = Path.of(replaced);
                System.out.println(pth);
                try {
                    Files.copy(source, trgt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }

    public static void main(String[] args) throws IOException {
        Path source = Path.of("files");
        Path target = Path.of("files-new");
        copyPath(source, target);

    }
}
