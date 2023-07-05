package compare;


// here there is inconsistency between equals and comapreTo because
// equality based on id of product and comparing based on name of product
// you are encouraged to do the consistency, so we should change the equality to be based on name
// or change the comparing to be based on id
// we can fix this problem by using Comparator
public class Product implements Comparable<Product> {
    private int id;
    private String name;

    public int hashCode() {
        return id;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) {
            return false;
        }
        var other = (Product) obj;
        return this.id == other.id;
    }

    public int compareTo(Product obj) {
        return this.name.compareTo(obj.name);
    }
}
