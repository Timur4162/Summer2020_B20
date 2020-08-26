package day26_MultiDimesionalArray;

import java.util.Arrays;

public class Multi_Dimensional_array_INTRO {
    /*
            Multi-Dimensional array: array that contains arrays
            n dimensional array contains (n-1) dimensional arrays
            2 dimensional arra: contains single dimensional array
                    int[][] arr2D = { {1,2,3} , {4,5}, {6,7,8} };
                                         0        1       2
                               arr2D[0] ===> {1,2,3}
                               arr2D[1] ===> {4,5}
                               arr2D[2] ===> {6,7,8}

        ===> [index of 1D arrays] [index of Elements]
     */
    public static void main(String[] args) {

        char[] ch1 = {'A', 'B'};
        char[] ch2 = {'C', 'D', 'E'};
        char[] ch3 = {'F', 'G', 'H'};


        //                 0    1      0    1    2      0    1    2
        char[][] ch2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'G', 'H'}};
        //                   0              1                2

        System.out.println(ch2D[1]);                          //  CDE == (1)
        System.out.println(Arrays.toString(ch2D[1]));      //  [C, D, E]
        System.out.println(Arrays.toString(ch2D[2]));      //  [F, G, H]

        // take H from the [F, G, H]
        // ch2D[2][2];
        System.out.println(ch2D[2][2]);    // retrieved the H element

        // C
        System.out.println(ch2D[1][0]);

        // G B
        System.out.println(ch2D[2][1] + " " + ch2D[0][1]);
        System.out.println("===========================================================");

        //{1,2,3}, {4}, {5,6}, {7,8,9,10}

        int[][] nums = {{1, 2, 3}, {4}, {5, 6}, {7, 8, 9, 10}};
        //                  0       1      2          3
        // retrieve 7 8 9 10
        System.out.println(Arrays.toString(nums[3]));   // when Arrays.toString ===> [ 7, 8 ,9, 10]
        System.out.println();


        /*
        {1,2,3}
        {4}
        {5,6}
        [7,8,9,10]


        Arrays.deepToString(array): converts multi-D array to String
        Arrays.toString - converts 1D array (regular) to String

         */
        for (int i = 0; i <= nums.length-1; i++){
            System.out.println( Arrays.toString(nums[i]));
        }

        System.out.println(Arrays.deepToString(nums)); //  [[1,2,3], [4], [5,6], [7,8,9,10]];





    }
}
