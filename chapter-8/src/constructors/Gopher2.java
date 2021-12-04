package constructors;

public class Gopher2 {
  //In this example, the constructors call each other, and the
  //process continues infinitely.
  public Gopher2() {
    // this(5); // DOES NOT COMPILE
  }

  public Gopher2(int dugHoles) {

    this();       // DOES NOT COMPILE
  }
}
