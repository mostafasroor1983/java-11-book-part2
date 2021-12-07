package interfacepkg;


interface Herbivore {
   void eatPlants();
   void run(long i);
   CharSequence say();
   //Integer bit();
}

interface Omnivore {
   void eatPlants();
   void eatMeat();
   void run(int i);
   String say();
  // Float bit();
}

public class Bear implements Herbivore, Omnivore {
  public void eatMeat() {
    System.out.println("Eating meat");
  }

  public void eatPlants() {
    System.out.println("Eating plants");
  }

  public void run(long i) {}

  public void run(int i) {}

  public String say() {  return null; }

 // will not compile because these are not compatible and not overloaded
 // should be changed in the interfaces
 // public Integer bit(){ return 1;}
 // public Float bit(){ return 1.3f;}
}