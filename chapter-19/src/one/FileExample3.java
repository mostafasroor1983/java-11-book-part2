package one;

import java.io.File;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class FileExample3 {
    public static void main(String[] args) {
        var file = new File("test3.txt");
        System.out.println("File Exists: " + file.exists());
        if (file.exists()) {
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Parent Path: " + file.getParent());
            if (file.isFile()) {
                System.out.println("Size: " + file.length());
                System.out.println("Last Modified: " + new Date(file.lastModified()));
            } else {
                for (File subfile : file.listFiles()) {
                    System.out.println(" " + subfile.getName());
                }
            }
        }
    }
}
