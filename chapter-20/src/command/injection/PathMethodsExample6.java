package command.injection;

import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMethodsExample6 {


    public static void main(String[] args) {

        //Both of them are relative paths
        var path1 = Path.of("fish.txt");
        var path2 = Path.of("friendly/birds.txt");
        System.out.println("path1.relativize(path2):" + path1.relativize(path2));
        System.out.println("path2.relativize(path1):" + path2.relativize(path1));

        System.out.println("----------------------------------------");
        //Both of them are absolute paths
        Path path5 = Paths.get("/", "Users", "mostafasrour", "Desktop",
                "projects", "gtihub", "java-11-book-part2");
        Path path6 = Paths.get("/", "Users", "mostafasrour", "Desktop", "projects");
        System.out.println(path5.relativize(path6));
        System.out.println(path6.relativize(path5));

        System.out.println("----------------------------------------");
        Path path3 = Paths.get("E:\\habitat");
        Path path4 = Paths.get("E:\\sanctuary\\raven\\poe.txt");
        System.out.println(path3.relativize(path4));
        System.out.println(path4.relativize(path3));

        System.out.println("----------------------------------------");
        //The relativize() method requires that both paths are absolute
        //or both relative and throws an exception if the types are mixed.
        Path path8 = Paths.get("/primate/chimpanzee");
        Path path9 = Paths.get("bananas.txt");
        path8.relativize(path9); // IllegalArgumentException

        System.out.println("----------------------------------------");
        //On Windows‐based systems, it also requires that if absolute
        //paths are used, then both paths must have the same root directory or drive letter
        Path pat1 = Paths.get("c:\\primate\\chimpanzee");
        Path pat2 = Paths.get("d:\\storage\\bananas.txt");
        pat1.relativize(pat2); // IllegalArgumentException


    }
}
