package handling;

public class Example3 {
  public static void main(String[] args) {
    try {
      System.out.println(Integer.parseInt(args[1]));
    } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
      System.out.println("Missing or invalid input");
    }
  }
}
