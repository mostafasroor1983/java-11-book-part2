package staticMethodsInterface;

public interface Hop {
    // can't be marked final or abstract, can't be inherited and implicitly public
      static int getJumpHeight() {
        return 8;
    }

}

class Bunny implements Hop {
    public void printDetails() {
        System.out.println(Hop.getJumpHeight()); // can be called on the name of interface.
        // DOES NOT COMPILE because getJumpHeight is not inherited from parent class
        // System.out.println(getJumpHeight());
    }
}
