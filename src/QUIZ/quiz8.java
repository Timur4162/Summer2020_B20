package QUIZ;

import java.util.Arrays;

public class quiz8 {
    public static void main(String[] args) {


        byte[] b = new byte[5];
        for (int j = 0; j < b.length; j++) {
            b[j] = (byte) (b[j] * 2);
        }
        System.out.print(b);
        System.out.println();

        //=================
        String[] words = {"one", "two", "three", "four"};
        String[] other = new String[words.length];
        int index = 0;

        for (String word : words) {
            other[index++] = word + word.length();
        }
        System.out.print(Arrays.toString(other));

        System.out.println();

        //========


        int[] arr = {1, 3, 12, 5, 24, 7, 9, 10};
        boolean[] bArr = new boolean[arr.length];

        for (int i = arr.length - 1; i > -1; i--) {

            if (arr[i] % 2 == 0) {
                bArr[arr.length - 1 - i] = true;
            }
        }
        System.out.print(Arrays.toString(bArr));


        System.out.println();
/*

        int[] nums = {14, 1, 84, 97, 1243, 46};
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += 3;
        }else{
            total += 10;
        }

        if (i % 3 == 0) {
            total -= 15;
        }
    }
    */

}

}
