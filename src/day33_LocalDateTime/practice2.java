package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class practice2 {

    public static void main(String[] args) {

        String[] classmates = {"Tiabaldo", "Enrique", "Antonio", "Tereza", "Victor"};

        LocalDate[] birthDates = {
                LocalDate.of(1982, 12, 12),
                LocalDate.of(1993, 11, 25),
                LocalDate.of(1980, 05, 23),
                LocalDate.of(1990, 2, 21),
                LocalDate.of(1982, 11, 28)
        };

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM/dd/yy EEEE");

        // Antonio  : May/23/80 Monday

        for (int i = 0; i<= classmates.length-1;i++){
            System.out.println(classmates[i]+" : " + birthDates[i].format(dateFormat));
        }



    }
}
