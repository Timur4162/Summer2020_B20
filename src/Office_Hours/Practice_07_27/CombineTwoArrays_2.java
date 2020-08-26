package Office_Hours.Practice_07_27;

import java.util.Arrays;

public class CombineTwoArrays_2 {
    public static void main(String[] args) {

        char[] a1 = {'A', 'B', 'C'}; // i = 0, 1, 2
        char[] a2 = {'D', 'E', 'F', 'G', 'I', 'J', 'K', 'L'};   // j: 0, 1, 2, 3, 4, 5, 6, 7, 8

        char[] a3 = new char[a1.length + a2.length];   // == index:
// how to concatenate two arrays

//                          WITH REGULAR FOR LOOP

        int index = 0; // a3 index number

        for (int i = 0; i <= a1.length - 1; i++) {              //  A B C
            a3[index] = a1[i];
            index++;
        }


        for (int j = 0; j <= a2.length - 1; j++) {              // D E F G I J K L
            a3[index] = a2[j];
            index++;
        }

 /*             WITH USING WHILE LOOP
        int j = 0;
        while (j <= a2.length - 1) {

            a3[index] = a2[j];
            index++;
            j++;
        }
*/

        System.out.println(Arrays.toString(a3));


    }
}
