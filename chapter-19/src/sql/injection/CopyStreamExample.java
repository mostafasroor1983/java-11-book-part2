package sql.injection;

import java.io.*;

public class CopyStreamExample {

    static void copyStream(InputStream in, OutputStream out) throws
            IOException {
        int b;
        //read byte data from a stream.
        while ((b = in.read()) != -1) {
            //write byte data to a stream.
            out.write(b);
        }
    }

    static void copyStream(Reader in, Writer out) throws IOException {
        int b;
        //read character data from a stream:
        while ((b = in.read()) != -1) {
            out.write(b);
        }
    }

    public static void main(String[] args) {
       /* try (var reader = new FileReader("test3.txt");
             var writer = new FileWriter("test.txt")) {
            copyStream(reader, writer);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        try (var reader = new FileInputStream("test3.txt");
             var writer = new FileOutputStream("test.txt")) {
            copyStream(reader, writer);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
