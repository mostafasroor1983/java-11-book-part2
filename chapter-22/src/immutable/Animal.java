package immutable;

import java.util.*;

//We carefully followed the first three rules, but unfortunately,
//Hacker Harry can modify our data by calling
//getFavoriteFoods().clear() or add a food to the list that our
//animal doesn't like. It's not an immutable object if we can change it contents!
public final class Animal {
    private final ArrayList<String> favoriteFoods;

    public Animal() {
        this.favoriteFoods = new ArrayList<String>();
        this.favoriteFoods.add("Apples");
    }

    public List<String> getFavoriteFoods() {
        return favoriteFoods;
    }
}

//ImmutableAnimal is a true immutable object because the mutable variable "favoriteFoods" cannot
//be modified by the caller by defining getFavoriteFoodsCount, getFavoriteFoodsElement  .
final class ImmutableAnimal {
    private final ArrayList<String> favoriteFoods;

    public ImmutableAnimal() {
        this.favoriteFoods = new ArrayList<String>();
        this.favoriteFoods.add("Apples");
    }

    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }

    public String getFavoriteFoodsElement(int index) {
        return favoriteFoods.get(index);
    }

}

final class ImmutableAnimal2 {
    private final ArrayList<String> favoriteFoods;

    public ImmutableAnimal2() {
        this.favoriteFoods = new ArrayList<String>();
        this.favoriteFoods.add("Apples");
    }

    //Another option is to create a copy of the favoriteFoods object and return the copy anytime it is
    //requested, so the original remains safe.
    public ArrayList<String> getFavoriteFoods() {
        return new ArrayList<String>(this.favoriteFoods);
    }
}


final class ImmutableAnimal3 {
    private final ArrayList<String> favoriteFoods;

    public ImmutableAnimal3(ArrayList<String> favoriteFoods) {
        if (favoriteFoods == null)
            throw new RuntimeException("favoriteFoods is required!");

        //Because we  maintained the same favoriteFoods object reference, the caller will be able to clear favoriteFoods
        //using favoriteFoods.clear() to avoid that we use copy constructor for favoriteFoods ArrayList
        //this.favoriteFoods = favoriteFoods;

        //this.favoriteFoods = new ArrayList<>(favoriteFoods);
        this.favoriteFoods = (ArrayList) favoriteFoods.clone();
    }

    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }

    public String getFavoriteFoodsElement(int index) {
        return favoriteFoods.get(index);
    }
}
