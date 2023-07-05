package overriding;

class Canine {
    public double getAverageWeight() {
        return 50;
    }
}

public class Wolf extends Canine {
    public static void main(String[] args) {
        Canine canine = new Canine();
        System.out.println(canine.getAverageWeight());
        canine = new Wolf();
        System.out.println(canine.getAverageWeight());
    }

    public double getAverageWeight() {
        // super is used here to call parent method
        return super.getAverageWeight() + 20;
    }
}