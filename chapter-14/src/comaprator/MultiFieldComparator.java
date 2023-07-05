package comaprator;

import java.util.Comparator;

/*
* We want to write a Comparator to sort by species name. If two
  squirrels are from the same species, we want to sort the one that weighs the least first.
* */
public class MultiFieldComparator implements Comparator<Squirrel> {
  public int compare(Squirrel s1, Squirrel s2) {
//    int result = s1.getSpecies().compareTo(s2.getSpecies());
//    if (result != 0) {
//      return result;
//    }
    return s1.getWeight() - s2.getWeight();
  }
}