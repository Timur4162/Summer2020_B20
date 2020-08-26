package day23_Arrays;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class minAndMax {
    public static void main(String[] args) {


        int[] arr = {5, 5, 4, 3, 4, 1};
        int max = arr[0]; //  5
        int min = arr[0];


        for (int i = 1; i <= arr.length - 1; i++) {   // i: 1, 2 ,3, 4, 5

            if (arr[i] > max) {     // compares the array' elements and assign the maximum number to variable max
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);

    }
}
