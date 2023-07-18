package questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Question13 {
    public static void main(String[] args) throws IOException {
        var p1 = Path.of("zoo.log").normalize(); //k1
        var p2 = Path.of("mule.png");
        Files.copy(p1, p2, StandardCopyOption.COPY_ATTRIBUTES); //k2
        System.out.println(Files.isSameFile(p1, p2));
    }
}
