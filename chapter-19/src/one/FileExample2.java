package one;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class FileExample2 {
    public static void main(String[] args) {
        String fileName = "test3.txt";
        String path = "/Users/mostafasrour/Desktop/projects/github/java-11-book-part2";
        File parentDir = new File(path);
        System.out.println("parentDir is directory : " + parentDir.isDirectory());
        File zooFile2 = new File(parentDir, fileName);

        System.out.println(zooFile2.exists()); // true if the file exists

        //Retrieves the parent directory that the path is contained in or null if there is none
        System.out.println(zooFile2.getParent());
        System.out.println(new Date(zooFile2.lastModified()));

        System.out.println("files in the parentDir:" + Arrays.toString(parentDir.listFiles()));

        // Rename the file
        //System.out.println(zooFile2.renameTo(new File("test3.txt")));

        //Creates the directory named by this path including any nonexistent parent directories
        File dirs = new File(parentDir + "/a/b/c");
        System.out.println(dirs.mkdirs());
    }
}
