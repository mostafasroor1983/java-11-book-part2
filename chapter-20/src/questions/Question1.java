package questions;

import java.nio.file.Path;

public class Question1 {
    public static void main(String[] args) {
        var path = Path.of("/user/./root", "../kodiacbear.txt");

        //The relativize() method takes a Path value, not a String.
        //Path object is immutable
        //path.normalize().relativize("/lion");
        //path.normalize().relativize(Path.of("/lion"));
        System.out.println(path);
    }
}
