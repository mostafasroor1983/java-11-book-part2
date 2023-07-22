package sensetive.objects.solutions;

//we make the methods final, the subclass can't change the behavior on us.
//In general, you should avoid allowing your constructors to call any methods that a subclass
//can provide its own implementation for.
public class FoodOrder1 {
    private String item;
    private int count;

    public FoodOrder1(String item, int count) {
        setItem(item);
        setCount(count);
    }

    public final String getItem() {
        return item;
    }

    public final void setItem(String item) {
        this.item = item;
    }

    public final int getCount() {
        return count;
    }

    public final void setCount(int count) {
        this.count = count;
    }
}