package sensetive.objects.solutions;

//another way of preventing or controlling subclasses is to make the constructor private.
//This technique requires static factory methods to obtain the object.
public final class FoodOrder3 {
    private String item;
    private int count;

    private FoodOrder3(String item, int count) {
        setItem(item);
        setCount(count);
    }

    public FoodOrder3 getOrder(String item, int count) {
        return new FoodOrder3(item, count);
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}