package handling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.MissingResourceException;

public class Example4 {

    public static void doesNotCompile() { // METHOD DOES NOT COMPILE
        try {
            mightThrow();
            // } catch (FileNotFoundException | IllegalStateException e) {
            // } catch (InputMismatchException e |  MissingResourceException e) { // doesn't compile : just one variable allowed in catch block
        } catch (FileNotFoundException |
                 IllegalArgumentException e) {    // doesn't compile : FileNotFoundException defined in above catch block
        } catch (Exception e) {
            // } catch (IOException e) {                                            // doesn't compile : because IOException is subclass of Exception
        }
    }

    private static void mightThrow() throws DateTimeParseException, IOException {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        doesNotCompile();
    }
}
