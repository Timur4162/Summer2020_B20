package day12_Switch_Scanner;

import java.util.Scanner;

public class UserInput_Practice1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        double num1 = scan.nextDouble();

        String result = (num1 % 2 == 0) ? num1 + "  is Even": num1 + " is odd";
        System.out.println(result);



    }


}
