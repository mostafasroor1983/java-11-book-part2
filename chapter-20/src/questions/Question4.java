package questions;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question4 {
    public static void main(String[] args) {
        //working directory is /user/home
        var p = Paths.get("/zoo/animals/bear/koala/food.txt");
        System.out.print(p.subpath(1, 3).getName(1).toAbsolutePath());  ///user/home/bear
    }
}
