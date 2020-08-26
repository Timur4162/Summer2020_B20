package day24;
/*
2. write a program that asks user how many numbers he wants to enter, and get all the user inputs and store them
 into an array variable, and then write the program that can return maximum and minimum numbers

 */

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you qant to enter");
        int n = scan.nextInt();

        int[] arr = new int[n];// 1, 2, 3, 4, 5

        for (int i = 0; i <= n - 1; i++) {  // get user inputs and storing 'em in the array
            System.out.println("Enter a number");
            int num = scan.nextInt(); // enter 1, and it gonna be assigned to array
            arr[i] = num; // it needs to reassign all numbers one by one
        }
        // arr[i] = scan.nextInt(); <==== shorter variant

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i <= arr.length - 1; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];       //  for minimum number needs the second if statement
            }

        }
        System.out.print("Maximum number: " + max);
        System.out.println();
        System.out.print("Minimum number: " + max);
    }
}

