package errors;

/*
* The ExceptionInInitializerError is an error because Java
  failed to load the whole class. This failure prevents Java from continuing.
* */
public class ExceptionInInitializerError {
  //ExceptionInInitializerError
  static {
    int[] countsOfMoose = new int[3];
    //ArrayIndexOutOfBoundsException
    int num = countsOfMoose[-1];
  }

  public static void main(String... args) {
  }
}
