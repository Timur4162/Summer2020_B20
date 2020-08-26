package day33_LocalDateTime;

import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 2, 5};   // {5,4,3,2,1}

        // first accending order neeed to be done

        Arrays.sort(arr);   //   {1,2,3,4,5}
        System.out.println(Arrays.toString(arr));// [1,2,3,4,5];

        int[] arr2 = new int[arr.length];  // if 5 in arr we need to provide 5
        //  length - means to provide the same numbers as in arr
        // will be 00000 cos we did only the numbers of arr
        System.out.println(Arrays.toString(arr2)); // [0,0,0,0,0]

        arr2[0] = arr[arr.length - 1]; // 5
        System.out.println(Arrays.toString(arr2)); // [5,0,0,0,0]

        arr2[1] = arr[3]; // 4
        System.out.println(Arrays.toString(arr2)); // [ 5,4,0,0,0]

        arr2[2] = arr[2]; // 3
        System.out.println(Arrays.toString(arr2)); // [5,4,3,0,0]

        arr2[arr2.length - 1] = arr[0];  // 3
        System.out.println(Arrays.toString(arr2));


        // better to use ForLoop for make it in descending order

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];

            k--;
        }
        System.out.println(Arrays.toString(arr2));

        int[] scores = {100, 75, 85, 96, 65, 45};
        scores = SortDescOrder(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("===========================");


        double[] n1 = {5.5, 6.5, 2.5, 3.5, 1.5, 0, 0.5};
        n1 =  SortDescOrder(n1);

        System.out.println( Arrays.toString(n1) );



    }

    public static int[] SortDescOrder(int[] arr) {
        Arrays.sort(arr);   //   {1,2,3,4,5}


        int[] arr2 = new int[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];

            k--;
        }

        return arr2;
    }
    public static double[] SortDescOrder(double[] arr) {
        Arrays.sort(arr);   //   {1,2,3,4,5}


       double[] arr2 = new double[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];

            k--;
        }

        return arr2;
    }
    public static char[] SortDescOrder(char[] arr) {
        Arrays.sort(arr);   //   {1,2,3,4,5}


        char[] arr2 = new char[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];

            k--;
        }

        return arr2;
    }
    public static String[] SortDescOrder(String[] arr) {
        Arrays.sort(arr);   //   {1,2,3,4,5}


        String[] arr2 = new String[arr.length];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];

            k--;
        }

        return arr2;
    }
}
