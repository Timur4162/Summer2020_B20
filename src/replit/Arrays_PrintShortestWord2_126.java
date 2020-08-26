package replit;

import java.util.Scanner;

/*
Write a program that will find out shortest words in the given string str.
If there are few words that are evenly short, print them all.
Use split method in order to split str string variable and create an array of strings.
Print array with Arrays.toString() method. Sort array before printing.

Split values by comma: split(", ");

input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray]
 */


public class Arrays_PrintShortestWord2_126 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] words = str.split(", ");

        for ( String each : words){
            
        }


    }
}
