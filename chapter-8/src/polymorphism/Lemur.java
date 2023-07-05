package polymorphism;

interface HasTail {
    public abstract boolean isTailStriped();
}

class Primate {
    public boolean hasHair() {
        return true;
    }
}

public class Lemur extends Primate implements HasTail {
    public int age = 10;
    public boolean isTailStriped() {
        return false;
    }
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);                // 10
        HasTail hasTail = lemur;
        //System.out.println(hasTail.age);            // doesn't compile
        System.out.println(hasTail.isTailStriped());  //false
        Primate primate = lemur;
        System.out.println(primate.hasHair());        //true
        //System.out.println(primate.isTailStriped());// doesn't compile

        System.out.println("===============");
        // explicit casting, now all properties and methods of Lemur is accessible via lemur2
        Lemur lemur2 = (Lemur) hasTail;
        System.out.println(lemur2.age);             // 10
        System.out.println(lemur2.isTailStriped()); // false
        System.out.println(lemur2.hasHair());       // true

        System.out.println("===============");
        Lemur lemur3 = (Lemur) primate;
        //Lemur lemur4 =(String) primate; // the compiler doesn't allow this casting, doesn't compile
        System.out.println(lemur3.age);
        System.out.println(lemur3.isTailStriped());
        System.out.println(lemur3.hasHair());
    }

  /*public boolean hasHair() {
    return false;
  }*/

}