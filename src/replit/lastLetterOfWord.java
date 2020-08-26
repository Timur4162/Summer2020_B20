package replit;

import java.util.Scanner;

public class lastLetterOfWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.next();

        System.out.println(word.charAt(word.length()-1));

       // System.out.println(word.length()-1);

       /* Scanner input = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String str = input.next();

        int ch = str.charAt(str.length()-2);

        System.out.println("Length is: "+ch);
      */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String str = scan.next();

        int length=str.length();

        System.out.println("Length is: "+length);


    }
}

