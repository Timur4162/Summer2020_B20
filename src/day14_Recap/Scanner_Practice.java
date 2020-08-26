package day14_Recap;
import java.util.Scanner;

public class Scanner_Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter you gender: ");
        String gender = input.next();

        System.out.println("Enter you age: ");
        int age = input.nextInt();

        System.out.println("Enter your country name: ");
        String country = input.next();

        System.out.println("Enter your zip code: ");
        int zip = input.nextInt();
        input.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your full company name: ");
        String company = input.nextLine();

        System.out.println("You entered: "+fullName+", "+age+", "+gender+", "+company+", "+country+" "+zip);






    }

}
