package two;

import java.io.*;

public class FileInputStreamExample {
    public static void printData(InputStream is) throws IOException {
        int b;
        while ((b = is.read()) != -1) {
            System.out.print((char)b);
        }
    }

    public static void readFile(String fileName) throws IOException {
        try (var fis = new FileInputStream(fileName)) {
            printData(fis);
        }
    }

    public static void main(String[] args) throws IOException {
        readFile("test3.txt");
    }
}
