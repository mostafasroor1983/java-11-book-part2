package constructors;

public class Turtle {
  private String name;

  //constructors overloading
  public Turtle() {
    name = "John Doe";
  }

  public Turtle(int age) {
  }

  public Turtle(long age) {
  }

  public Turtle(String newName, String... favoriteFoods) {
    name = newName;
  }
}
