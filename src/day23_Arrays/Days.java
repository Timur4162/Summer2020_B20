package day23_Arrays;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] days = new String[7];

        days[6] = "Sunday";
        days[1] = "Tuesday";
        days[4] = "Friday";
        days[3] = "Thursday";
        days[5] = "Saturday";
        days[2] = "Wednesday";
        days[0] = "Monday";

        for (int i = 0; i <= days.length-1; i++) {
            System.out.println(days[i]+" ");
        }
        System.out.println();

        System.out.println("============================");
        System.out.println("enter a number between 1 ~ 7");
        int n = input.nextInt();
        System.out.println( days[n-1]);


    }
}
