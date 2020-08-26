package replit;

import java.util.Scanner;

public class charAt_3rd_5th_6th {
    public static void main(String[] args) {

        /*
        using charAt method output the 3rd letter of txt string then the 5th letter then the 6th letter.

use print not println.
         */

        Scanner scan = new Scanner(System.in);
        String txt = scan.next();

        char ch = txt.charAt(2);
        char ch1 = txt.charAt(4);
        char ch2 = txt.charAt(5);


        System.out.println(ch);
        System.out.println(ch1);
        System.out.println(ch2);

    }
}
