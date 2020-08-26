package day14_Recap;

import java.util.Scanner;

public class nextLine_VS_theRest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Enter
        System.out.println("Enter your age");

        int num = input.nextInt(); // 19Enter   (but Enter will still in scanner input memory)

        input.nextLine();       // takes Enter - one time use only

        System.out.println("Enter your full name");
        String fullName = input.nextLine();     // by default ENTER be assigned to this STRING

        System.out.println("Enter your company name: ");
        String companyName = input.nextLine();   // if you use nextLINE after nextLINE you havent take out the ENTER
                // but if you use nextLINE after THE REST you have to TAKE OFF ENTER by ==> input.nextLine();

        System.out.println("You entered: "+num);
        System.out.println("You entered: "+fullName);
        System.out.println("You entered company name as: "+companyName);


    }
}
