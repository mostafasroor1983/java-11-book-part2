package innerClass;

public class Fox {
  public static void visitFriend() {
    Fox fox = new Fox();
    fox.new Den();
    //new Den();// DOES NOT COMPILE
  }

  public void goHome() {
    this.new Den();
    new Den();
  }

   private class Den {
  }
}

 class Squirrel {
  public void visitFox() {
    Fox fox = new Fox();
    //fox.new Den(); // because Den is private inner Class
   // new Den(); // DOES NOT COMPILE
  }
}