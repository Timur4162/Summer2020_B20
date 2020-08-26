package day22;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

        int max = -999999999;

        for (int i = 1;  i <= 5;i++){
                System.out.println("Enter a number");   // need s to be repeated 5 times=> need to be placed to FORLOOP body
                int n  = scan.nextInt();

                if (max < i) {
                   max = i;
                }


            }
        System.out.println("Maximum number: "+ max);






    }
}
