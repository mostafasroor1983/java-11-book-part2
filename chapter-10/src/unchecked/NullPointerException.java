package unchecked;

// it is unexpected unchecked exception
public class NullPointerException {

  public static void main(String[] args) {
    //throw NullPointerException : unchecked exception
    //fall(null);

    // throw ArrayIndexOutOfBoundsException : unchecked exception
    fall2();

  }

  static void fall(String input) {
    System.out.println(input.toLowerCase());
  }

  static void fall2() {
    String[] animals = new String[0];
    System.out.println(animals[0]);
   /// System.out.println(animals[-1]);
  }

}
