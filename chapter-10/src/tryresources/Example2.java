package tryresources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {
  public static void main(String[] args) {
    readFile();
  }

  // try with resources the jvm will be responsible for closing and releasing the resource
  // the resources will be closed at the end of try clause and before the catch block
  static void readFile() {
    try (var fis = new FileInputStream("file.txt");
         var fos = new FileOutputStream("file.txt"); ) {
      // Read file data
    } catch (IOException e) {
      System.out.println("IOException...");
    }
  }

  // try with resources: the catch block is optional
  // note that IOException should be declared in the method declaration because the catch block is missing
  // The finally clause exists implicitly. You just don’t have to type it.
  // you can type another finally block
  static void readFile2() throws IOException {
    try (FileInputStream fis = new FileInputStream("file.txt") ) {
      // Read file data
    }
  }

}
