package day08_Logical_Operators;

import java.util.Scanner;

public class RateCalculator {
/*
write a program for the rate calculator
            1. asks the user to enter the salary (as double)
            2. asks the user how many hours does he/she works in a week (as int)
            3. print the hourly rate of the employee
            assume that one year has 52 weeks
            hourRate = salary/ (weeklyHour * 52)
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary in a year: ");
        double salary = scan.nextDouble();
        System.out.println("How many hours you work in a week: ");
        double hourWeek = scan.nextDouble();

        String hourRate = "Your hourly rate is: " + (salary/(hourWeek*52))+ "$";
        System.out.println(hourRate);






    }


}
