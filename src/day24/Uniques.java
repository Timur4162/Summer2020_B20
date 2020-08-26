package day24;

/*
1. write a program that can find the unique characters from a String
        Ex:
            input: aabccd
            output: bd

 */
public class Uniques {
    public static void main(String[] args) {

        String str = "aabcc";

        String uniques = "";    // b

        for (int i = 0; i <= str.length()-1; i++){
            char ch = str.charAt(i); // returns CHAR  / first time execute                              A, A, B, C, C
            int first = str.indexOf(ch); // returns first occured charachter // when comparing b = 2    0  0  2  3  3
            int last = str.lastIndexOf(ch); // when comparing b = 2                                     1  1  2  4  4

            if (first == last){  // when comparing indexOf and lastIndexOf and when exactly the same ==> it means UNIQUE
                uniques += ch;
            }
        }
        System.out.println(uniques);
    }
}
