package Office_Hours.Practice_08_24;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Recap {

    /*
    Array
    Collection
    Map
     */

    public static void main(String[] args) {

        int[] arr1 = new int[5];
        arr1[0] = 3;
        arr1[1] = 14;
        // System.out.println(arr1);  =  HASH CODE

        arr1[arr1.length - 1] = 20;


        System.out.println(Arrays.toString(arr1));


        int[] arr2 = {1, 2, 3, 4, 5};
        //            0  1  2  3  4
        System.out.println(Arrays.toString(arr2));

        System.out.println(arr2[4] * arr2[1]); // 10
        //                    5          2
        System.out.println(arr2[0] * arr2[arr2.length - 1]); // 5
        //                   1              5
        System.out.println("=========================================================");


        Scanner scan = new Scanner(System.in);
        String[] names = new String[5];


        //names[0] = scan.nextLine();

       /* for (int i = 0; i <= 4; i++) {
            System.out.println("Enter a name");
            names[i] = scan.nextLine();
        }
      */
        for (int i = names.length-1; i >= 0; i--) { // i-=1   REVERSE
            System.out.println("Enter a name");
            names[i] = scan.nextLine();
        }

        System.out.println(Arrays.toString(names));


    }


}
