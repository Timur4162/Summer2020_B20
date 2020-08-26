package day18_For_Loop;

import java.util.Scanner;

/*
write a program that can reverse the following string:
                String str = "Java";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method

 */
public class Reverse {

    public static void main(String[] args) {
        //     Scanner scan = new Scanner(System.in);           SCANNER VARIANT
        //     String str = scan.next();

        String str  = "Java";
        // avaJ     === ava, J  =====> subsrting of str

        String s1 = str.substring(1);     // ava
        String s2 = str.substring(0,1);   //"J"
        //char ch1 = str.charAt(0);  =====> if want to use char

        String result1 = s1+s2;
        System.out.println(result1);



    }

}
