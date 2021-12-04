package polymorphism;

class Bird {
}

public class Fish {
  public static void main(String[] args) {
    Fish fish = new Fish();
    /*if (fish instanceof Bird) { // DOES NOT COMPILE, compile doesn't allow using instanceof with unrelated types.
      Bird bird = (Bird) fish;    // DOES NOT COMPILE, compiler also doesn't allow casting with unrelated types.
    }*/
  }
}