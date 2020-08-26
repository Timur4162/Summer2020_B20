package day30_CustomMethods;

import java.util.Arrays;

public class return_Methods_3 {


    public static void main(String[] args) {
        int[] arr = {100,200,50,50,40};
        int num = max(arr);
        System.out.println(num);
        System.out.println(num > 3000);

      //  int num2 = max2(arr);  === gives an error === cos it cannot be reassigned without RETURN method

    }


    public static int max(int[] arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;
    }

    public static void max2(int[] arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];

    }


}
