package day16_String;

import java.util.Scanner;

public class substring_Practice {
    public static void main(String[] args) {

        // extra task
        String str = "I like to drink Pepsi";
        String drink = str.substring(16);
        System.out.println(drink);

        String action = str.substring(10,15);// 14+1
        System.out.println(action);


        System.out.println("===========================================");

        /*
1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you first name");
        String str1=scan.next();

        System.out.println("Enter your second name");
        String str2=scan.next();


// ppleanana
        // String result =   str1.substring(1).concat(  str2.substring(1)   );
        String result = str1.substring(1) + str2.substring(1);
        System.out.println(result);


    }
}
