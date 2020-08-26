package day28_Recap;

import java.util.Arrays;

public class multiD_Array {
    public static void main(String[] args) {
// each array and each element has own index number
        int[] arr1D = {1, 2, 3};

        //                0  1  2    0  1  2  3  4    0  1   2    3   4
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};
        //                   0              1                  2

        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(arr2D[1][4]);//    <======= without Arrays.deepToString

        //      Arrays.toString == for SINGLE DIMENSIONAL int ARRAY
        //      Arrays.deepToString == for multi-Dimensional ARRAY

        System.out.println("=========================================================");

        for (int i = 0; i <= arr2D.length - 1; i++) {   // iterates each 1D of the ARRAY from arr2D
  /*          int[] each1DArray = arr2D[i];                                   // GETTING EACH OF THE ARRAY
           // System.out.println(Arrays.toString(each1DArray));

            for (int j =0;j<=each1DArray.length-1;j++){         //  INNER LOOP == Responding to iterates the elements each 1D Array
                 int eachNum = each1DArray[j];
                 if (eachNum%2==0){    //    <===    NEEDS FOR PRINT THE EVEN NUMBERS
                     System.out.print(eachNum+" ");
                 }

            }
            System.out.println();  //   <=== needs to separate the result lines in CONSOLE
        }

*/
            System.out.println("==========================================");
            System.out.println();

            for (int[] each1D : arr2D) {
                for (int eachElement : each1D) {
                    if (eachElement%2!=0){
                        System.out.print(eachElement+" ");
                    }

                }
                System.out.println();
            }


        }
    }
}