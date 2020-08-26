package day24;

import java.util.Arrays;

public class String_Methods {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJ";  // goes to char
        char[] ch = str.toCharArray();

        //================  SORT  ====================
        //  str.toCharArray()

        System.out.println(Arrays.toString(ch));   // String mostly needs to be assigned to char
        String str1 = "DCEBA";
        String str2 = "ADCBE";

        char[]ch1 = str1.toCharArray(); //  D C E B A
        char[]ch2 = str2.toCharArray(); //  A D C B E

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.print(ch1);
        System.out.println();
        System.out.print(ch2);
        System.out.println();

        boolean r1 = Arrays.equals(ch1,ch2);
        System.out.println(r1);

        System.out.println("===============================");

        //=================  SPLIT ====================

        String sentence = "I love Programming Language";
        // Language Programming Love I ==> Expecting result

        String[] words = sentence.split(" ");  //  { I , love,  Programming,  Language }
        System.out.println(Arrays.toString(words));

        for (int i = words.length-1; i>=0; i--) {   // last Index to REVERSE
            System.out.print(words[i]+" ");
        }

        System.out.println();
        System.out.println("=================================");

        //========== ANOTHER SCENARIO OF SPLIT METHOD ===============

        String s = "JAVA";
        String[] arr = s.split("");
        System.out.println(Arrays.toString(arr));   //  [J, A, V, A]

        String[] crr = s.split("");
        System.out.println(Arrays.toString(crr));   //  [J, A, V, A]
    }
}
