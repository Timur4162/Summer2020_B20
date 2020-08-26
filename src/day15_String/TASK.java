package day15_String;

import java.util.Scanner;

public class TASK {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scan.next();
        System.out.println("Enter your last name: ");
        String lastName = scan.next();

        String fullName = firstName + " " + lastName;
        fullName ="YOUR FULL NAME"+firstName.toUpperCase() + " " + lastName.toUpperCase();

        System.out.println(fullName);



    }
}
