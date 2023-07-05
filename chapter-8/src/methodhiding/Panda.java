package methodhiding;

class Bear {
    public static void eat() {
        System.out.println("Bear is eating");
    }

    public void run() {
        System.out.println("Bear is running");
    }
}

public class Panda extends Bear {
    // method hiding because it applies all methods overriding and both methods are static
    // if delete it => always calling "Bear is eating" in the main method
    public static void eat() {
        System.out.println("Panda is chewing");
    }

    public void run() {
        System.out.println("Panda is running");
    }
    
    public static void main(String[] args) {
        eat();          //Panda is chewing
        Panda.eat();    //Panda is chewing
        Bear.eat();     //Bear is eating

        Bear bp = new Panda();
        bp.eat();       //Bear is eating, call method based on reference type at runtime
        bp.run();       //Panda is running call method based on object type at runtime, dynamic polymorphism applied

        Bear bb = new Bear();
        bb.eat();       //Bear is eating
        bb.run();       //Bear is running

        Panda p = new Panda();
        p.eat();        //Panda is chewing
        p.run();        //Panda is running
    }


}