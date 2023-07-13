package two;

import java.io.*;

public class CopyFileWithBufferExample {
    static void copyFileWithBuffer(File src, File dest) throws
            IOException {
        try (var in = new BufferedInputStream(new FileInputStream(src));
             var out = new BufferedOutputStream(new FileOutputStream(dest))) {
            var buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, lengthRead);
                out.flush();
            }
        }
    }



    public static void main(String[] args) throws IOException {
        copyFileWithBuffer(new File("test.txt"), new File("test3.txt"));
    }
}
