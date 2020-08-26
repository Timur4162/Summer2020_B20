package day27_recap_Arrays;

import java.util.Arrays;

public class for_each_Loop {
/*
 for each loop: WE HAVE A DATA STRUCTURE IN ORDER TO USE
 length -1 ==> last index
   iteration order in for each loop = fixed : 0 ~ length -1
    for (DataType name: Collection of Data){ <== will be assigned to Datatype NAME (recommended to be the same datatype)
             statements:
     }

            in for each loop - NO INDEX NUMBERS !!!!
 */

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("==================================");

        for (int each : arr) {                   //     for EACH LOOP
            System.out.print(each);
        }
        System.out.println();
        System.out.println("==================================");

        // to print in REVERSE ORDER
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        // =============     FOR EACH LOOP USE WHEN YOU DO NOT PROVIDE THE INDEXES       ===========
        System.out.println();
        System.out.println("======================================");

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        int countDivisibleBy3 = 0;
        for (int each : scores) {
            if (each % 3 != 0) {
                continue;
            }
            countDivisibleBy3++;
            System.out.print(each + " ");
        }

        System.out.println();
        System.out.println(countDivisibleBy3);  // shows how many numbers divisible by 3


        System.out.println("===================================");

        // TASK.   Find the words which contains C

        String[] names = {"AB", "ABC", "A", "AB", "ABCD"};

        for (String each : names) {
            if (!each.contains("C")) {
                continue;
            }
            System.out.println(each + " ");


        }
        System.out.println();
        System.out.println("======================");


        // Task. FIND THE MINIMUM and MAXIMUM in the ARRAY

        int[] score = {80, 75, 65, 110, 90, 45, 56, 78};

        int max = score[0];   // [0] is just a temperary number
        int min = score[0];

        for (int each : score) {
            if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }

        }
        System.out.println("maximum number is: " + max);
        System.out.println("minimum number is: " + min);


    }
}