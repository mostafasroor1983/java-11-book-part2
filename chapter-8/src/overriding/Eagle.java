package overriding;

class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }

    public void eat(int food) {
        System.out.println("Bird is eating " + food + " units of food");
    }
}

public class Eagle extends Bird {

    //overloading
    public int fly(int height) {
        System.out.println("Bird is flying at " + height + " meters");
        return height;
    }

    // neither overriding nor overloading
  /*public int eat(int food) { // DOES NOT COMPILE
    System.out.println("Bird is eating " + food + "  units of food");
    return food;
  }*/
}