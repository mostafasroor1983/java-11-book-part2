package questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Question7 {
    public static void main(String[] args) throws IOException {

        //Since the first path is relative and the second path is absolute, this comparison will return false, forcing
        //isSameFile() to check for the existence of both paths in the file system.
        //Since we know /zoo/turkey does not exist, a NoSuchFileException is thrown, and option F is the correct answer.
        Path path = Paths.get("turkey");
        if (Files.isSameFile(path, Paths.get("/zoo/turkey")))// z1
            Files.createDirectories(path.resolve("info"));  // z2
    }
}
