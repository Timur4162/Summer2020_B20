package day28_Recap;

import java.util.Arrays;

public class quiz4 {
    public static void main(String[] args) {


        int[]intArr = {15,30,45,60,75};
        intArr[2] = intArr[4];
        intArr[4]=90;
        System.out.println(Arrays.toString(intArr));

        //15,75,45,60,90
        //15,30,75,60,90
        //15,30,45,75,90
        //15,30,45,60,90


    }
}
