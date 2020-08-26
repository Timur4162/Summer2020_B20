package day32_MethodOverloading;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = 10;

        //{1,2,3,4}  <=== needs this result

        int[] arr2 = new int[arr.length + 1];   // contains ALL ELEMENTS FROM ARR + one more
        arr2[arr2.length - 1] = num;   // to insert = the last ELEMENT
        int i = 0;

        for (int each : arr) { // EACH = represents the elements
            arr2[i] = each;
            i++;
        }

        System.out.println(Arrays.toString(arr2));

        System.out.println("================================");

        int[]scores = {87,89,88,89,92};
        int n1 = 98;

        scores = addElement(scores,n1);
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));


    }

    public static int[] addElement(int[] arr, int num){
        int[] arr2 = new int[arr.length + 1];   // contains ALL ELEMENTS FROM ARR + one more
        arr2[arr2.length - 1] = num;   // to insert = the last ELEMENT
        int i = 0;

        for (int each : arr) { // EACH = represents the elements
            arr2[i] = each;
            i++;
        }

        return arr2;
    }


}
