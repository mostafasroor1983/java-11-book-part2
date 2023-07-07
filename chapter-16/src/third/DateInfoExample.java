package third;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateInfoExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.OCTOBER, 20);
        System.out.println(date.getDayOfWeek()); // TUESDAY
        System.out.println(date.getMonth());     // OCTOBER
        System.out.println(date.getYear());      // 2020
        System.out.println(date.getDayOfYear()); // 294
    }
}
