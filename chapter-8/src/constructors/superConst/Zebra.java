package constructors.superConst;

public class Zebra extends Animal {
  // either this() or super() can be called in the same constructor not the both
  public Zebra(int age) {
    //System.out.println(age); It must be the first statement in the constructor
    //It can be just a single super() call
    super(age); // Refers to constructor in Animal
  }

  public Zebra() {
    this(4); // Refers to constructor in Zebra with int argument
  }

  public static void main(String[] args) {
    // here we can't access age directly from child class, but we can over getAge and setAge
    Zebra z1 = new Zebra();
    System.out.println(z1.getAge());

    Zebra z2 = new Zebra(10);
    System.out.println(z2.getAge());
  }
}