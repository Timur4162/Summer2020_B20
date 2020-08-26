package day18_For_Loop;

import java.util.Scanner;

/*
write a program that asks user's first and last name, then prints out the initials of the user

                input:
                    cybertek
                    batch18
                output:
                    your initial is: CB
        DO NOT use charAt method

 */
public class Initials {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // if needs to enter by user

        //String firstName = "cybertek";
        //String lastName = "school";
        String firstName = scan.next();
        String lastName = scan.next();

        // SUBSTRING ========================

       /* firstName.substring(0, 1);   // only gets the character at index 0
        lastName.substring(0, 1);

        String initials = firstName.substring(0, 1) + "." + lastName.substring(0, 1);
        initials = initials.toUpperCase();      // if needed the UPPERCASE letters

        System.out.println(initials);

*/

        //  CHAR AT ==========================

        char ch1 = firstName.charAt(0);
        char ch2 = lastName.charAt(0);
        System.out.println(ch1 + "." + ch2);    // + it does the addition      === 150

        String initial = "" + ch1 + ch2;     // CHAR cannot be concat to STRING ==> needs EMPTY "" +
               initial = initial.toUpperCase();

        System.out.println(initial);


    }
}
