package day25;

import java.util.Arrays;

public class Array1_100 {
    public static void main(String[] args) {

        int[] numbers = new int[100];

    /*    numbers[0] = 1;
          numbers[1] = 2;
          numbers[2] = 3;
          numbers[3] = 4;
          ....
    */

        for (int i =0; i <= numbers.length-1; i++){
            numbers[i] = i+1;
        }

        System.out.print(Arrays.toString(numbers));
        System.out.println();

        for (int each : numbers){
            if (each%2!=0) {   // to skip ODD numbers  ==> prints the EVEN numbers
                continue;
            }
            System.out.print(each+ " ");
        }


    }
}
