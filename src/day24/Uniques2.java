package day24;

import java.util.Scanner;

/*
1. write a program that can find the unique characters from a String
        Ex:
            input: aabccd
            output: bd

 */
public class Uniques2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next(); // assume ===> "aabcc";

        String expectedResult = "";

        for (int j = 0; j <= str.length() - 1; j++) {

            char ch1 = str.charAt(j);// a  ===> checks only the FIRST CHARACTER
            // retrieve the first character
            int count1 = 0;  // 1 + 1 (because a = a) compares first character

            for (int i = 0; i <= str.length() - 1; i++) { // used for finding the frequency of ch and assign in char
                char each = str.charAt(i); // a a b c c
                if (ch1 == each) {
                    count1 += 1;

                }
            }
            if (count1 == 1) {       // if it only occured one time
                expectedResult += ch1;
            }


        }



        System.out.println(expectedResult);
    }




}
