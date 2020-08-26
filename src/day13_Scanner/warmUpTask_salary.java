package day13_Scanner;

import java.util.Scanner;

public class warmUpTask_salary {
    /*
    write a program 1. company name
                    2. first name
                    3. last name
                    4. Job title
                    5. salary that asks the user enter the:
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your company name: ");
        String companyName = scan.nextLine();

        System.out.println("Enter your first name: ");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scan.nextLine();

        System.out.println("Enter your jobTitle: ");
        String jobTitle = scan.nextLine();

        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();

        String details = companyName+", "+firstName+", "+lastName+", "+jobTitle+", "+salary+"$";
        System.out.println(details);

        scan.close();







    }




}
