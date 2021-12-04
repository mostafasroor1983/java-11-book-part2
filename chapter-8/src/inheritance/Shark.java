package inheritance;

class Fish {
  protected int size;
  private int age;

  public Fish(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }
}

public class Shark extends Fish {
  private int numberOfFins = 8;
  // if we don't define it here then there is just one version of size variable for super and this
  // so that any change on it will be reflected on super and this.
  //private int size ;
  public Shark(int age) {
    super(age);
    this.size = 4;
    //super.size = 4;
  }

  public static void main(String[] args) {
    new Shark(12).displaySharkDetails();
  }

  public void displaySharkDetails() {
    System.out.print("Shark with age: " + getAge());
    System.out.print(" and " + super.size + " meters long");
    System.out.print(" with " + numberOfFins + " fins");
  }
}
