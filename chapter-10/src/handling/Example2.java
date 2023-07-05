package handling;

import java.io.FileNotFoundException;

class AnimalsOutForAWalk extends RuntimeException {
}

class ExhibitClosed extends RuntimeException {
}

class ExhibitClosedForLunch extends ExhibitClosed {
}

public class Example2 {
  /*static void seeAnimal() throws FileNotFoundException {
    throw new FileNotFoundException();
  }*/

    static void seeAnimal() {
        throw new RuntimeException();
    }

    /*static void seeAnimal() {
     throw new IllegalArgumentException();
    }
  */
    public void visitPorcupine() {
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) {    // first catch block
            System.out.print("try back later");
        } catch (ExhibitClosed e) {         // second catch block
            System.out.print("not today");
        }
    }


    public static void visitMonkeys() {
        try {
            seeAnimal();
            // does compile because the narrower exception is the first in order in catch block
        } catch (ExhibitClosedForLunch e) {  // subclass exception
            System.out.print("try back later");
        } catch (ExhibitClosed e) {         // superclass exception
            System.out.print("not today");
        }
    }

    public static void main(String[] args) {
        visitMonkeys();
    }
  /*public void visitMonkeys() {
    try {
      seeAnimal();
      // does compile because the border exception is the first in order in catch block
    } catch (ExhibitClosed  e) {
      System.out.print("try back later");
    } catch (ExhibitClosedForLunch  e) {   // doesn't compile
      System.out.print("not today");
    }
  }*/


}
