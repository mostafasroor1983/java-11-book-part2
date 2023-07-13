package one;

import java.io.File;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) {
        String fileName = "test3.txt";
        var zooFile1 = new File(fileName);
        System.out.println(zooFile1.exists()); // true if the file exists
        System.out.println(zooFile1.getAbsolutePath());
        System.out.println(zooFile1.getParent());
        System.out.println(zooFile1.getName());
        System.out.println("Number of bytes:" + zooFile1.length());  //Retrieves the number of bytes in the file
    }
}
