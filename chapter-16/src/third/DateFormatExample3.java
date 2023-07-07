package third;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateFormatExample3 {
    public static void main(String[] args) {
        var dt = LocalDateTime.of(2020, Month.OCTOBER, 20, 6, 15, 30);

        var g1 = DateTimeFormatter.ofPattern("MMMM dd', Party''s at' hh:mm");
        System.out.println(dt.format(g1)); // October 20, Party's at 06:15

        var g2 = DateTimeFormatter.ofPattern("'System format, hh:mm: 'hh:mm");
        System.out.println(dt.format(g2)); // System format, hh:mm: 06:15

        var g3 = DateTimeFormatter.ofPattern("'NEW! 'yyyy', yay!'");
        System.out.println(dt.format(g3)); // NEW! 2020, yay!

        //Without escaping the text values with single quotes, an
        //exception will be thrown at runtime if the text cannot be
        //interpreted as a date/time symbol.
        //IllegalArgumentException: Unknown pattern letter: T
        //var g4 = DateTimeFormatter.ofPattern("The time is hh:mm"); //Exception thrown

        //Failure to terminate an escape sequence will trigger an exception at runtime.
        var g5 = DateTimeFormatter.ofPattern("'Time is: hh:mm: "); //Exception thrown
    }
}
