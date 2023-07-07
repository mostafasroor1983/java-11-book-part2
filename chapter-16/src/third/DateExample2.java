package third;

import java.time.*;

public class DateExample2 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2020, Month.OCTOBER, 20);
        LocalDate date2 = LocalDate.of(2020, 10, 20);

        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30); // +seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // +nanoseconds

    }
}
