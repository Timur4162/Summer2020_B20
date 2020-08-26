package day13_Scanner;
import java.util.Scanner;

public class Next_Practice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);          // ex. cybertek school - goes to memory
        System.out.println("Enter your first name: ");
        String FirstName = scan.next();                 // cybertek - take one word to memory, wont b.a.add second word
        scan.next();   // can take the second word - one time use

        System.out.println("Enter your last name: ");
        String lastName = scan.next();

        String fullName = FirstName +" "+lastName;

        System.out.println("Full name is: "+fullName);


    }
}
