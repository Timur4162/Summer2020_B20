package day22;

/*
 *
 **
 ***
 ****
 *****
 ******
 *******

 *******
 ******
 *****
 ****
 ***
 **
 *

 */
public class Nested_Loop_4 {
    public static void main(String[] args) {


        for (int j = 1; j <= 7; j++) {    // j:  1 2 3 4 5 6 7

            for (int k = 1; k <= j; k++) {  // k: 1 2 3 4 5 6 7
                System.out.print("*");
            }
            System.out.println();
        }

            System.out.println("==========================================");

            for (int j = 7; j >= 1; j--) {
                for (int k = j; k >= 1; k--) {
                    System.out.print("*");
                }
                System.out.println();
            }


        }



    }

