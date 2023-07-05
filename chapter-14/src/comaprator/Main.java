package comaprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Squirrel> list1 = getListOfSquirrels();
        System.out.println(list1);
        Collections.sort(list1, new MultiFieldComparator());
        System.out.println(list1);

        System.out.println("----------------------------");
        List<Squirrel> list2 = getListOfSquirrels();
        // sorting based on reversing the defined Comparator
        Comparator<Squirrel> comparator1 = Comparator.comparing(Squirrel::getSpecies).reversed();

        // sorting based on the same comparing in MultiFieldComparator
        Comparator<Squirrel> comparator2 = Comparator.comparing(Squirrel::getSpecies)
         .thenComparingInt(Squirrel::getWeight);

        // sorting based on Comparable
        Comparator<Squirrel> comparator3 = Comparator.naturalOrder();

        // sorting based on reversed Comparable
        Comparator<Squirrel> comparator4 = Comparator.reverseOrder();

        System.out.println(list2);
        Collections.sort(list2, comparator2);
        System.out.println(list2);
    }

    private static List<Squirrel> getListOfSquirrels() {
        Squirrel s1 = new Squirrel(90, "A");
        Squirrel s2 = new Squirrel(80, "A");
        Squirrel s3 = new Squirrel(70, "B");
        List<Squirrel> list = new ArrayList<>();
        list.addAll(List.of(s1, s2, s3));
        return list;
    }
}
