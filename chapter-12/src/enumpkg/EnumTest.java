package enumpkg;

import java.util.Arrays;

public class EnumTest {

    public static void main(String[] args) {
        Season s = Season.SUMMER;
        System.out.println(Season.SUMMER);                          // SUMMER
        System.out.println(s == Season.SUMMER);                     // true
        System.out.println("SUMMER" == Season.SUMMER.name());       // true
        System.out.println("SUMMER".equals(Season.SUMMER.name()));  // true

        // values is a static method
        System.out.println(Arrays.toString(Season.values()));       // [WINTER, SUMMER, FALL, SPRING]

        for (Season season : Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        //ordinal is an instance method
        System.out.println(Season.WINTER.ordinal());                // 0
        System.out.println(Season.SPRING.ordinal());                // 3

        //valueOf is a static method
        //System.out.println(Season.valueOf("summer"));             // IllegalArgumentException

        //retrieving an enum value from a String
        System.out.println(Season.valueOf("summer".toUpperCase()));

        //if ( Season.SUMMER == 2) {} // DOES NOT COMPILE
        //public enum ExtendedSeason extends Season { } // DOES NOT COMPILE

        switchEnum(Season.FALL);

    }

    private static void switchEnum(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Get out the sled!");
                break;
            case SUMMER:
                System.out.println("Time for the pool!");
                break;
            // doesn't compile : case should have unqualified enum label
            /*case Season.SPRING:
                System.out.println("Time for the pool!");
                break;*/
            default:
                System.out.println("Is it summer yet?");
        }
    }

    private enum Season {
        WINTER, SUMMER, FALL, SPRING
    }
}
