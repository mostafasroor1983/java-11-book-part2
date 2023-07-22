package immutable.two;

import java.util.ArrayList;

public class ImmutableAnimal5 implements Cloneable {
    private final ArrayList<String> favoriteFoods;

    public ImmutableAnimal5(ArrayList<String> favoriteFoods) {
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

    public ImmutableAnimal5 clone() {
        ArrayList<String> listClone = (ArrayList) favoriteFoods.clone();
        return new ImmutableAnimal5(listClone);
    }

    public static void main(String... args) throws Exception {
        ArrayList<String> food = new ArrayList<>();
        food.add("grass");
        ImmutableAnimal5 sheep = new ImmutableAnimal5(food);
        ImmutableAnimal5 clone = (ImmutableAnimal5) sheep.clone();
        System.out.println(sheep == clone);
        System.out.println(sheep.favoriteFoods == clone.favoriteFoods);
    }
}
