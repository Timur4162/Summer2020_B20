package day30_CustomMethods;

import java.util.Arrays;

/*
warmUp tasks:
    1. create a function that can print out the maximum number between two numbers
    2. create a function that can print out the array of integers in descending order
    3. create a function that can print out the combination of two integer arrays
    4.
        step1: create a function that can check if the given integer is positive, negative or zero
        step2: Use the above method to  write a program that can check every single elements of an array of Integers
        MUST use for each loop

 */
public class WarmUpTask {

    public static void main(String[] args) {
        maxNum(12, 12);
        System.out.println("=========================================");
        int arr[] = {1, 2, 3, 4, 5, 7, 55, 343, 3};
        printDesc(arr);
        System.out.println("=========================================");
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {6,7,8,9,10,11,12,13,14};
        combine2Arrays(a1, a2);
        System.out.println("=========================================");
        PosNegZero(0);
        System.out.println("=========================================");
        int[] a3 = {100,-100,-200,-300,0,0,900,5000};

        for (int each : a3){
            PosNegZero(each);
        }
    }

    // task 1:
    public static void maxNum(int a, int b) {

        if (a == b) {
            System.out.println("Equal");
            return;  // exits the methods
        }

        if (a >= b) {
            System.out.println(a + " is maximum");
        } else {
            System.out.println(b + " is maximum number");
        }
    }

    //  Task 2 : ==================================================
    public static void printDesc(int[] arr) {       //exp. { 10, 9, 20, 30, 5, 6, 7
        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");  // 30, 20, 10, 9, 7, 6, 5
        }

        System.out.println();
    }

    //Task3: { 1,2,3 } { 4, 5, 6} ==> { 1, 2, 3, 4, 5, 6 }
    public static void combine2Arrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;

        for (int each : arr1) {
            arr3[i] = each;
            i++;
        }
        for (int each : arr2) {
            arr3[i] = each;
            i++;
        }
        System.out.println(Arrays.toString(arr3));
    }

    //Task4:
    public static void PosNegZero(int num){
        if (num>0){
            System.out.println(num+ " is positive");
        }else if(num<0) {
            System.out.println(num+ " is negative");
        }else {
            System.out.println(num+ " is zero");
        }
    }
}
