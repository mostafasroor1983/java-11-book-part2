package polymorphism;

class Rodent {
}

public class Capybara extends Rodent {
    public static void main(String[] args) {
        Rodent rodent1 = new Rodent();
        // ClassCastException rodent1 can't cast to Capybara because refer to object type Rodent not Capybara
        // Capybara capybara1 = (Capybara) rodent1;

        Rodent rodent2 = new Capybara();
        Capybara capybara2 = (Capybara) rodent2; // rodent2 can cast to Capybara because refer to object type Capybara

        // because rodent1 is not an instanceOf Capybara = > couldn't be casted
        if (rodent1 instanceof Capybara) {
            System.out.println("rodent1 instanceof Capybara");
        }

        if (rodent2 instanceof Capybara) {
            System.out.println("rodent2 instanceof Capybara");
        }

    }
}