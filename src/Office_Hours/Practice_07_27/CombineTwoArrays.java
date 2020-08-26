package Office_Hours.Practice_07_27;

import java.util.Arrays;

public class CombineTwoArrays {

    public static void main(String[] args) {

        char[] a1 = {'A', 'B', 'C'}; // 3
        char[] a2 = {'D','E','F', 'G', 'I', 'J','K','L'};   // 8

        char[] a3 = new char[a1.length+a2.length];   // == {A, B, C, D, E, D, E, F}
// how to concatinate two arrays

        // the process of adding two different arrays in the third one ==== MANUAL PROCESS

     // index   elements
        a3[0] = a1[0]; // A
        a3[1] = a1[1]; // B
        a3[2] = a1[2]; // C

        a3[3] = a2[0]; // D
        a3[4] = a2[1]; // E
        a3[5] = a2[2]; // F

       // System.out.println(Arrays.toString(a3));

        int index = 0;
        for ( char each : a1){              //  A B C
            a3[index] = each;
            index++;
        }

        for ( char each : a2){              // D E F G I J K L
            a3[index] = each;
            index++;
        }

        System.out.println(Arrays.toString(a3));


    }
}
