package abstractpkg;

 abstract class Whale {
   //private abstract void sing(); // DOES NOT COMPILE
}
public class HumpbackWhale extends Whale {
   void sing() {
    System.out.println("Humpback whale is singing");
  }
}