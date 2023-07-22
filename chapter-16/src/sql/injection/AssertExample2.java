package sql.injection;

public class AssertExample2 {
    public static void main(String[] args) {

        int x = 10;

        // Not good assertion design because it changes the variables and alter the outcomes.
        // The value of x should be the same whether we turned the assertion on or off.
        assert ++x > 10;
    }
}
