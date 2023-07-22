package sensetive.objects.problem;

import java.util.List;

public class FoodOrder {
    private String item;
    private int count;

    public FoodOrder(String item, int count) {
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

    public static int total(List<FoodOrder> orders) {
        return orders.stream()
                .mapToInt(FoodOrder::getCount)
                .sum();
    }
}