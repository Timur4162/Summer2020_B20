package QUIZ.Q_08_14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class q9 {
    public static void main(String[] args) {
/*
        LocalDate date = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("M/d/yy");
        date = date.plusDays(1).minusYears(2).minusWeeks(1);

        System.out.println(date.format(format));
       */


        LocalDate date = LocalDate.of(2018,1,18);
        LocalTime time = LocalTime.of(14,42);
        LocalDateTime dateTime = LocalDateTime.of(date,time);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy| hh:mm");
        System.out.println(dateTime);


    }
}
