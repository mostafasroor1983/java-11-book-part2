package sensetive.objects.problem;


//Hacker Harry because he can pass in his malicious subclass of FoodOrder.
//He overrides the getCount() and setCount() methods so that count is always zero.
public class HarryFoodOrder extends FoodOrder {
    public HarryFoodOrder(String item, int count) {
        super(item, count);
    }
    public int getCount() { return 0; }
    public void setCount(int count) { super.setCount(0); }
}