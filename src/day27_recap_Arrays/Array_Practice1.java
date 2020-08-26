package day27_recap_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice1 {
    public static void main(String[] args) {

        String[] names = {"Aalia", "Nurbi", "Ayse"};  // Arrays' size is fixed!!!
// index numbers:            0        1        2   Retrieve number 1

        System.out.println(names[1]);
        //   System.out.println(names[24]); // IndexOutOfBound
        System.out.println("================================================");

        for (int i = 0; i <= names.length - 1; i++) {
            //  if (names[i].charAt(0) != 'A' )         // condition of printing the names STARTING with 'A'
            if (!names[i].startsWith("A"))    // skiping the names which are not started with A, if needed print the names without A - take out !
                continue;   // continue - skips
            System.out.println(names[i]);
        }

        System.out.println("======================================================");

        /*
        DataType[] name = new DataType[length]   ====   SIZE
        default values for int, long, byte, short ===> 0;
        float, double ====> 0.0
        boolean ==> false
        String ===> null
        */

        int[] numbers = new int[5];     // initialize the size of int ==> 5
        System.out.println(numbers);

        numbers[3] = 25;    // if needed to assign to ARRAY-3, the result = 0,0,0,25,0
        numbers[0] = 100;   // 100, 0, 0, 25, 0
        numbers[3] = 300;   // 100, 0, 0, 100, 0

        System.out.println(Arrays.toString(numbers));   //   0,0,0,0,0


        System.out.println("============================================");

        // create  a programm to enter the names in ARRAY (5 names)
        // String [] students = new String [5];  // input depend on [5] on this size
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter a name");
        //  students[0] = input.nextLine();  // Muhtar, we need the same 5 steps to make 5 inputs ==> for loop needed

        System.out.println("How many names do you want to enter");

        String[] students = new String[input.nextInt()];  // input asking the size of entering


        input.nextLine(); // ==> to take out the ENTER in a Scanner

        for (int i = 0; i <= students.length-1; i++) {
            System.out.println("Enter a name");
            students[i] = input.nextLine();  // next name
        }


        System.out.println(Arrays.toString(students));


    }
}
