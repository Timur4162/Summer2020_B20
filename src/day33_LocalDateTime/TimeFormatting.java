package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/*
year : yy, yyyy
Month: MM(number), MMM(three letters), MMMM (full Name)
days: dd
days name: E (three letters) EEEE (full name)
 */
public class TimeFormatting {
    public static void main(String[] args) {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("EEEE, MMMM/dd/yyyy");

        LocalDate ld = LocalDate.of(2020,07,25);

        System.out.println(ld);
        System.out.println(ld.format(dateFormat));

        /*
        hours: hh
        minutes: mm
        second: ss
        am/pm: a
        */

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormat));

        System.out.println();

        //May/20/2019 Dayname 4:30 pm

        DateTimeFormatter DTFormat = DateTimeFormatter.ofPattern("MMM/dd/yy EEEE hh:mm a");
        LocalDateTime time1 = LocalDateTime.of(2019,5,20,16,20);
        System.out.println(time1);
        System.out.println(time1.format(DTFormat));

        System.out.println( LocalDateTime.now().format(DTFormat) );


        // Saturday 4:34:45 pm
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        LocalDateTime rNow = LocalDateTime.now();
        System.out.println(rNow);

        System.out.println(rNow.format(DTFormat));

    }
}
