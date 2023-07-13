package four;

import java.io.*;

public class PrintStreamExample2 {
    public static void main(String[] args) throws IOException {
        try (var in = new FileInputStream("zoo.txt")) {
            System.out.println("Found file!");
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        }
    }
}
