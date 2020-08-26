package day33_LocalDateTime;

import java.time.LocalDate;
import java.util.Scanner;

                                    // find the LEAP year

public class Dates {

    public static void main(String[] args) {

        LocalDate DOB = LocalDate.of(1986, 01,22);
            // year - month - day
        System.out.println(DOB);

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate y = LocalDate.of(2020,1,1);
        boolean result = y.isLeapYear();
        System.out.println(result);
        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scan.nextInt();

        boolean result2 = LocalDate.of(year, 1,1).isLeapYear();
        System.out.println(result2);
        System.out.println("==================================");
        System.out.println("Enter birth year, birth month and birth day");

        LocalDate result3 = LocalDate.of(scan.nextInt(), scan.nextInt(),scan.nextInt());
        System.out.println(result3);
        System.out.println(result3.isLeapYear());







    }
}
