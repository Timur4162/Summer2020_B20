package day22;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your user name:");
        String u = scan.next();

        System.out.println("Enter your password");
        String p = scan.next();


        int attemp = 0;

        while ( !(u.equals("cyber")&& p.equals("tek123")) ){
            if (attemp > 3){
                System.out.println("Your account is locked");
                System.exit(0);
            }

            System.out.println("Invalid user name or password, Please re-enter");
            System.out.println();
            System.out.println("Enter your user name");
            u = scan.next();

            System.out.println("Enter your password");
            p = scan.next();
            attemp++;

        }




        System.out.println("Logged in");

    }
}
