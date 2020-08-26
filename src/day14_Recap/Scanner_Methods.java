package day14_Recap;

import java.util.Scanner;

public class Scanner_Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // int num = input.nextInt();
        // double num = input.nextDouble();

        //boolean num = input.nextBoolean();    only accept TRUE or FALSE

        System.out.println("Do you wanna learn Java?");
        //String num = input.next(); // only take ONE WORD!!!
        String num = input.nextLine();   // takes everything


        System.out.println("You have entered: " + num);


    }


}
