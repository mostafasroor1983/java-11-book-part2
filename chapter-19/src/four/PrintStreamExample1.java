package four;

import java.io.*;

public class PrintStreamExample1 {
    public static void main(String[] args) throws IOException {
        PrintStream print = new PrintStream("test.txt");
        PrintStream print1 = new PrintStream(new File("test.txt"));
        PrintStream print2 = new PrintStream(new FileOutputStream("test.txt"));
        PrintStream print3 = new PrintStream(new BufferedOutputStream(
                new FileOutputStream("test.txt")));
    }
}
