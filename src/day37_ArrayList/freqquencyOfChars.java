package day37_ArrayList;

import Library.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class freqquencyOfChars {
    /*
    write a program that can find the frequency of character from a String
                        DO NOT use nested loop
                        "AABBCCDDEE"  ==> "ABCDE"
                        output: A2B2C2D2E2

     */

    public static void main(String[] args) {
        String str = "AAAAABBC";

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(str.split("")));


      /*  for (String each : str.split("")) {
            list.add(each);
        }

       */
        String nonDup = Util.removeDup(str);
        for (String each : nonDup.split("")) {
            int count = Collections.frequency(list, each);
            System.out.print(each + count);
        }

    }
}
