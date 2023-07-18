package three;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMethodsExample7 {
    public static void main(String[] args) {
        // normalise() to eliminate unnecessary and redundancies in path
        var p1 = Path.of("./armadillo/../shells.txt");
        System.out.println(p1.normalize());         // shells.txt
        var p2 = Path.of("/cats/../panther/food");
        System.out.println(p2.normalize());         // /panther/food
        var p3 = Path.of("../../fish.txt");
        System.out.println(p3.normalize());         // ../../fish.txt


        System.out.println("------------------------");
        var p11 = Paths.get("/pony/../weather.txt");
        var p22 = Paths.get("/weather.txt");
        System.out.println(p11.equals(p22));                            // false
        System.out.println(p11.normalize().equals(p22));                // true
        System.out.println(p11.normalize().equals(p22.normalize()));    // true
    }
}
