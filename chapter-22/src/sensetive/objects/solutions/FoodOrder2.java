package sensetive.objects.solutions;

//Security Sienna points out that we don't need to allow subclasses at all
//since everything we need is in FoodOrder.
//Hacker Harry can't create his malicious subclass to begin with!
public final class FoodOrder2 {
    private String item;
    private int count;

    public FoodOrder2(String item, int count) {
        setItem(item);
        setCount(count);
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