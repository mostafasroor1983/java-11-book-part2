package abstractpkg;

// abstract class : can't be instantiated and may contain abstract methods
abstract class Bird {
    static int numberOfBirds;

    static {
        numberOfBirds = 1;
    }

    boolean hasFeather;

    {
        hasFeather = true;
    }

    Bird() {
    }
  /*Bird(boolean hasFeather){
    this.hasFeather = hasFeather;
  }*/

    public abstract String getName();

    public void printName() {
        System.out.print(getName());
    }
}

//public class Stork extends Bird {} // DOES NOT COMPILE
public class Stork extends Bird {
    public static void main(String[] args) {
        new Stork().printName();
    }

    public String getName() {
        return "Stork!";
    }
}