package constructors.superConst;

class Mammal {
  public Mammal(int age) {
  }

 /* public Mammal() {
  }*/
}

/*

public class Elephant extends Mammal {
  // because the compiler insert default no-args constructor with super(), and because default no-args constructor not existed
  // in the parent class Mammal so this class doesn't compile
  // the solution to add no-arg constructor in parent class Mammal, or add constructor to Elephant with super(age)
  // DOES NOT COMPILE
}*/

public class Elephant extends Mammal {
  public Elephant() {
    super(10);
  }
}

class AfricanElephant extends Elephant {}
