package five;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class StreamApiExample5 {


    public static void main(String[] args) throws IOException {
        Path path = Path.of("chapter-20");
        BiPredicate<Path, BasicFileAttributes> predicate = (pt, attributes) -> Files.isDirectory(pt);
        BiPredicate<Path, BasicFileAttributes> predicate2 = (pt, attributes) -> !Files.isDirectory(pt);
        BiPredicate<Path, BasicFileAttributes> predicate5 = (pt, attributes) -> Files.isRegularFile(pt);
        BiPredicate<Path, BasicFileAttributes> predicate4 = (pt, attributes) -> attributes.size() > 1000;

        BiPredicate<Path, BasicFileAttributes> predicate3 = (pt, attributes) -> {
            Path name = pt.getName(pt.getNameCount() - 1);
            // System.out.println("name:" + name);
            return name.toString().endsWith(".java");
        };

        try (Stream<Path> stream = Files.find(path, 8, predicate4.and(predicate2).and(predicate3),
                                              FileVisitOption.FOLLOW_LINKS)) {
            stream.forEach(System.out::println);
        }
    }
}
