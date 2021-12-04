package constructors;

public class Hamster {
  private String color;
  private int weight;

  public Hamster(int weight) { // First constructor
    //System.out.println("Hamster");
    this(weight, "brown"); // should be the first statement
  }

  public Hamster(int weight, String color) { // Second constructor
    this.weight = weight;
    this.color = color;
  }
}