package day21_Loops;

import java.util.Scanner;

public class minAndMax {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max = -2147483647;  // MAX negative number = any user entered input WILL BE GREATER than
        int min = 2147483647;   // MAX positive number = any user entered input WILL BE LESS than

        for (int i=1;i<=5;i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num > max){
                max = num;
            }

            if(min > num){
                min = num;
            }

        }
        System.out.println("Maximum number is: "+ max);
        System.out.println("Minimum number is: "+ min);






    }
}
