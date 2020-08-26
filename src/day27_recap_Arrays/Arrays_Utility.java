package day27_recap_Arrays;

import java.util.Arrays;

public class Arrays_Utility {
    /*

    sort()
    toString()
    equals()

     */
    public static void main(String[] args) {

        String[] names = {"Odina", "Liliia", "Berk", "Emine"};
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        int[] score = {80, 75, 65, 110, 90, 45, 56, 78};
        Arrays.sort(score);
        System.out.println(Arrays.toString(score));

        System.out.println("Maximum: "+ score[score.length-1]);
        System.out.println("Minimum: " +score[0]);

        String[] s3 = {"C", "A", "B"};
       

    }
}
