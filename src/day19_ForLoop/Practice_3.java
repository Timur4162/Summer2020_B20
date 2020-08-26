package day19_ForLoop;

import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "Cybertek123";
        System.out.println("Enter the password: ");
        String input = scan.nextLine();

        while (!input.equals(password)){
            System.out.println("Please re-enter the password: ");
            input = scan.nextLine();

        }
        System.out.println("Logged in");
    }
}
