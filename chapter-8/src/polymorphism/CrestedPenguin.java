package polymorphism;

class Penguin2 {
    public static int getHeight() {
        return 3;
    }

    public void printInfo() {
        System.out.println(this.getHeight());
    }
}

public class CrestedPenguin extends Penguin2 {
    // this method is hidden
    public static int getHeight() {
        return 8;
    }

    public static void main(String... fish) {
        Penguin2 p = new CrestedPenguin();
        p.printInfo();                            //3
        CrestedPenguin cp = new CrestedPenguin();
        cp.printInfo();                           //3

        // the most important
        new CrestedPenguin().printInfo();         //3

        System.out.println("---------------------------------");
        // calling by reference type because it is hidden method
        System.out.println(p.getHeight());        //3
        System.out.println(cp.getHeight());        //8
        System.out.println(new CrestedPenguin().getHeight());        //8
    }

    // IMPORTANT:
  /*public void printInfo() {
    System.out.println(this.getHeight());
  }*/
}