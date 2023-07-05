package compare;


import java.util.ArrayList;
import java.util.Collections;

public class Duck implements Comparable<Duck> {
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        ducks.add(new Duck("puddles"));
        System.out.println(ducks);
        Collections.sort(ducks);        // sort by name, if we don't implement Comparable => doesn't compile
        System.out.println(ducks);      // [Puddles, Quack, puddles], because capital letter it comes before small in ascending order
    }

    public String toString() {        // use readable output
        return name;
    }

    public int compareTo(Duck d) {
        return name.compareTo(d.name); // sorts ascendingly by name
    }
}