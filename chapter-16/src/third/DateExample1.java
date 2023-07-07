package third;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class DateExample1 {
    public static void main(String[] args) {
        //Date with day, month, year
        System.out.println(LocalDate.now());

        //Time of day
        System.out.println(LocalTime.now());

        //Date and time with a no timezone
        System.out.println(LocalDateTime.now());

        //Date and time with a specific timezone
        System.out.println(ZonedDateTime.now());
    }
}
