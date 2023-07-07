package third;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateFormatExample2 {
    public static void main(String[] args) {
        var dateTime = LocalDateTime.of(2020, Month.OCTOBER, 20, 6, 15, 30);
        var formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");

        //These statements print the same value at runtime. Which syntax you use is up to you.
        System.out.println(dateTime.format(formatter)); //10/20/2020 06:15:30
        System.out.println(formatter.format(dateTime)); //10/20/2020 06:15:30

    }
}
