package day22;

import java.util.Scanner;

public class MinNUmber {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int min = 999999999;
        // whatever user enters it will be always less than that

        for (int i = 0; i < 5; i++){

            System.out.println("enter a number");
            int n = scan.nextInt();


            if(n < min){
                min = n;



            }
        }
        System.out.println("Minimum number: " + min);






    }
}
