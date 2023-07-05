package superRef;

class Insect {
    protected int numberOfLegs = 4;
    String label = "buggy";
}

public class Beetle extends Insect {
    protected int numberOfLegs = 6;
    short age = 3;

    public static void main(String[] n) {
        new Beetle().printData();
    }

    public void printData() {
        System.out.print(this.label);  // buggy
        System.out.print(super.label); // buggy
        System.out.print(this.age);    //3
        //System.out.print(super.age); // there is no version of age variable in parent class
        System.out.print(numberOfLegs);//6
    }
}