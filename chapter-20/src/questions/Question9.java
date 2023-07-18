package questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Question9 {
    public static void main(String[] args) throws IOException {
        //the resolve() method does not normalize any path symbols
        var path1 = Path.of("/pets/../cat.txt");
        var path2 = Paths.get("./dog.txt");
        System.out.println(path1.resolve(path2));
        System.out.println(path2.resolve(path1));
    }
}
