package thisRef;

public class Flamingo {
  private String color;

  public static void main(String... unused) {
    Flamingo f = new Flamingo();
    f.setColor("PINK");
    System.out.println(f.color); // null
  }

  public void setColor(String color) {
    //Java uses the most granular scope, so when it sees color = color,
    // it thinks you are assigning the method parameter value to itself.
    color = color; // the solution is this.color = color;
  }
}