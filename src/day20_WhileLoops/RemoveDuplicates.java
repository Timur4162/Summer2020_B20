package day20_WhileLoops;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
    //    Scanner scan = new Scanner(System.in);          CAN BE ADDED

        String str = "aabb";     //    "aabb"
        //            0123

    /*    String result = "";// "ab"

        for (int i = 0;i <= str.length()-1; i++  ){
            String s = " " + str.charAt(i);   // a, a , b, b
            if (!result.contains(s)){   // if the  character is already contained to result we'll not add it to result
                result += s;
            }

        }
*/
        String result = "";// "ab"

        for (int i = 0;i <= str.length()-1; i++  ){

            String s = "" + str.charAt(i);   // a,  b , a,  b

            if (!result.contains(s)){   // if the  character is already contained to result we'll not add it to result
                result += s;
            }

        }

        System.out.println(result);

    }


    }




