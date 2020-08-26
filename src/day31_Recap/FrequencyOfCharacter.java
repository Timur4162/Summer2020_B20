package day31_Recap;

import Library.Util;

public class FrequencyOfCharacter {

    // to import === import Library.Util;

    public static void main(String[] args) {


        String str = "AABBBCCCDDDDDDDDDEEEEEEEFFFFFFFFGGGGGGGIIIIIIJJJJJJJK";        //    ====> A2B3C3

        String expectedResult = "";     // A2B3C3   need to move from str to here

        String nonDup = Util.removeDup(str);      // ABC = for this result need to remove the duplicates

        //System.out.println(nonDup);


        for (char each : nonDup.toCharArray()) {
            int count1 = Util.frequency(str, each);
            expectedResult += "" + each + count1;
        }

        /*
        for (int i = 0; i <= nonDup.length()-1;i++){

            char ch1 = nonDup.charAt(i);           //  A B C       need to put i in nonDup.charAt(i)
            int count1 = Util.frequency(str, ch1); //  2 3 3

            expectedResult +=   ""+ ch1 + count1;
        }
        */
/*
        char ch1 = nonDup.charAt(0);                // gives ===== 'A'
        int count1 = Util.frequency(str, ch1);      // counts frequency
        expectedResult +=   ""+ ch1 + count1;

        char ch2 = nonDup.charAt(1);                // gives ===== 'B'
        int count2 = Util.frequency(str, ch2);      // counts frequency
        expectedResult +=   ""+ ch2 + count2;

        char ch3 = nonDup.charAt(2);                // gives ===== 'C'
        int count3 = Util.frequency(str, ch3);      // counts frequency
        expectedResult +=   ""+ ch3 + count3;


*/
        System.out.println(expectedResult);
        System.out.println("==================================");

        String str2 = "wwwweeeeeeeeeerrrrrrrrrrrrrtttttttttyyyyyyuuuuuuuI";
        String expectedResult2 = frequencyOfChars(str2);

        System.out.println(expectedResult2);

    }


    public static String frequencyOfChars(String str) {

        String expectedResult = "";   //   what needs to be returned in 'frequencyOfChars'
        String nonDup = Util.removeDup(str);

        for (char each : nonDup.toCharArray()) {
            int count1 = Util.frequency(str, each);
            expectedResult += "" + each + count1;
        }

        return expectedResult;
    }

}
