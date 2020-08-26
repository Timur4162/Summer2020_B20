package day33_LocalDateTime;

import java.time.LocalDate;

public class Practice1_LocalTimeArrayInNames_Dates {
    public static void main(String[] args) {



        // Task: create an array of String and store
        String[] classmates = {"Tiabaldo", "Enrique", "Antonio", "Tereza", "Victor"};

        LocalDate[] birthDates = {LocalDate.of(1982, 12, 12),
                LocalDate.of(1993, 11, 25),
                LocalDate.of(1980, 05, 23),
                LocalDate.of(1990, 2, 21),
                LocalDate.of(1982, 11, 28)
        };
        for (int i = 0; i <= classmates.length - 1; i++) {
            System.out.println(classmates[i] + " : " + birthDates[i]);
        }

        System.out.println("===========================");

        for (LocalDate each : birthDates) {  //   prints the birth dates ONLY
            System.out.println(each);
        }

        System.out.println();


        for(LocalDate each  : birthDates ) {  // prints the leap year
            if (!each.isLeapYear()) {
                continue;
            }
            System.out.println(each);
        }
    }
}
