package third;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateFormatExample {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2020, Month.OCTOBER, 20);
        LocalTime time = LocalTime.of(6, 15, 30);
        var dt = LocalDateTime.of(date, time);

        // formatting data and time
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        //UnsupportedTemporalTypeException: Unsupported field: HourOfDay
        //System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_TIME));
        //System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_DATE));

        var formatter2 = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm a");
        System.out.println(dt.format(formatter2)); // October 20, 2020 at 06:15

        var formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy  hh:mm:ss");
        System.out.println(dt.format(formatter1));

        var formatter4 = DateTimeFormatter.ofPattern("MM_yyyy_dd");
        System.out.println(dt.format(formatter4));

        //java.time.DateTimeException: Unable to extract ZoneId from temporal 2020-10-20T06:15:30
        //throws an exception at runtime because the underlying LocalDateTime does not have a time zone specified.
        var formatter3 = DateTimeFormatter.ofPattern("h:mm z");
        System.out.println(dt.format(formatter3));

    }
}
