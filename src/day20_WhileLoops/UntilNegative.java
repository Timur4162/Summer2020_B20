package day20_WhileLoops;

import java.util.Scanner;
/*
 1. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
            hint: you need an infinite loop
 */
public class UntilNegative {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i == 0; ) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if (num < 0) {
                break;
            }

            sum += num;

        }
        System.out.println(sum);

    }
}
