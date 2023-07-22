package sql.injection;

import java.io.*;
import java.util.Objects;

public class CopyFileWithBufferExample2 {
    static void copyFileWithBuffer(File src, File dest) throws
            IOException {
        try (var in = new BufferedReader(new FileReader(src));
             var out = new BufferedWriter(new FileWriter(dest))) {
            var buffer = new char[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer, 0, 100)) > 0) {
                out.write(buffer, 0, lengthRead);
                out.flush();
            }
        }
    }

    static void copyFileWithBuffer2(File src, File dest) throws
            IOException {
        try (var in = new BufferedReader(new FileReader(src));
             var out = new BufferedWriter(new FileWriter(dest))) {
            String line = in.readLine();
            while (!Objects.isNull(line)) {
                out.write(line);
                line = in.readLine();
                out.newLine();
                out.flush();
            }
        }
    }

    static void copyFileWithBuffer3(File src, File dest) throws
            IOException {
        try (var in = new BufferedReader(new FileReader(src));
             var out = new BufferedWriter(new FileWriter(dest))) {
            String line;
            while ((line = in.readLine()) != null) {
                out.write(line);
                out.newLine();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        copyFileWithBuffer3(new File("test.txt"), new File("test3.txt"));
    }
}
