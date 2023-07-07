package third;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateExample3 {
    public static void main(String[] args) {
        // You can combine dates and times in multiple ways.
        var dt1 = LocalDateTime.of(2020, Month.OCTOBER, 20, 6, 15, 30);

        LocalDate date = LocalDate.of(2020, Month.OCTOBER, 20);
        LocalTime time = LocalTime.of(6, 15, 30);
        var dt2 = LocalDateTime.of(date, time);

        System.out.println(dt1.isEqual(dt2));
        System.out.println(dt1.toString().equals(dt2.toString()));


    }
}
