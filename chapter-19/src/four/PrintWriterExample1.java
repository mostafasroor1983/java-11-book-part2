package four;

import java.io.*;

public class PrintWriterExample1 {
    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter(
                new FileOutputStream("test.txt"));

        PrintWriter writer2 = new PrintWriter(
                new BufferedOutputStream(new FileOutputStream("test.txt")));

        PrintWriter writer3 = new PrintWriter(
                new BufferedWriter(new FileWriter("test.txt")));

        PrintWriter writer4 = new PrintWriter(new File("test.txt"));

        PrintWriter writer5 = new PrintWriter("test.txt");
    }
}
