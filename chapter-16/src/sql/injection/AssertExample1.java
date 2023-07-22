package sql.injection;

public class AssertExample1 {
    public static void main(String[] args) {
        String name = "Cecelia1";
        //assert 1 == 2  : "Not Equal";
        assert ("Cecelia".equals(name)): "Failed to verify user data";
    }
}
