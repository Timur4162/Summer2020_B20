package day29_Customethods;

import java.util.Scanner;

public class MethodWithParameter {
    public static void main(String[] args) {
        printHello(2);   ///      <=== argument, which needed to be provided by input
        System.out.println("=========================");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year of birth and a current year");

        age(scan.nextInt(), scan.nextInt() );

    }


    public static void printHello(int n) {   //    <=== parameter name (int n)

        for (int i = 0; i < n; i++) {
            System.out.println("Hello World");
        }


    }


    public static void age(int yearOfBirth, int currentYear) {
        if (currentYear < yearOfBirth) {
            System.out.println("Invalid entry");
        }else {
            int age = currentYear - yearOfBirth;
            System.out.println("You are " + age + " years old");
        }
    }


}
