package sql.injection;

import java.io.*;

public class CopyStreamExample2 {


    static void copyFile(File src, File dest) throws IOException {
        try (var in = new FileInputStream(src);
             var out = new FileOutputStream(dest, true)) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        }
    }

    static void copyFile2(File src, File dest) throws IOException {
        try (var in = new FileInputStream(src);
             var out = new FileOutputStream(dest, true)) {
            int b;
            byte[] bytes = new byte[10];
            while ((b = in.read(bytes)) != -1) {
                out.write(bytes);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        copyFile2(new File("test.txt"), new File("test3.txt"));

    }
}
