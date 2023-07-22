package immutable.two;

import java.util.ArrayList;

public class ImmutableAnimal4 implements Cloneable {
    private final ArrayList<String> favoriteFoods;

    public ImmutableAnimal4(ArrayList<String> favoriteFoods) {
        if (favoriteFoods == null)
            throw new RuntimeException("favoriteFoods is required!");
        this.favoriteFoods = (ArrayList) favoriteFoods.clone();
    }

    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }

    public String getFavoriteFoodsElement(int index) {
        return favoriteFoods.get(index);
    }

    //By default, the clone() method makes a shallow copy of the
    //data, which means only the top‐level object references and
    //primitives are copied. No new objects from within the cloned
    //object are created. For example, if the object contains a
    //reference to an ArrayList, a shallow copy contains a reference
    //to that same ArrayList. Changes to the ArrayList in one object
    //will be visible in the other since it is the same object.

    public static void main(String... args) throws Exception {
        ArrayList<String> food = new ArrayList<>();
        food.add("grass");
        ImmutableAnimal4 sheep = new ImmutableAnimal4(food);
        ImmutableAnimal4 clone = (ImmutableAnimal4) sheep.clone();
        System.out.println(sheep == clone);
        System.out.println(sheep.favoriteFoods == clone.favoriteFoods);
    }
}
