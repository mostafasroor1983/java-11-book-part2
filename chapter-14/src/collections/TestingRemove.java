package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestingRemove {
    public static void main(String[] args) {
        Collection<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.remove("cardinal")); // false
        System.out.println(birds.remove("hawk"));     // true
        System.out.println(birds);                       // [hawk]


        // in List interface there are 2 remove method 1- index as param. 2- object as param.
        // calling remove() on a List with an int uses the index,
        // an index that doesn't exist will throw an exception.
        List<String> birds2 = new ArrayList<>();
        birds2.add("hawk1");
        birds2.add("hawk2");
        birds2.add("hawk3");
        System.out.println(birds2.remove(0));     // true
        System.out.println(birds2.remove(0));     // true
        // System.out.println(birds2.remove(3));        // IndexOutOfBoundsException
        System.out.println(birds2);                     // [hawk3]

    }
}
