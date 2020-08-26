package day24;

import java.util.Arrays;   //    <=================

public class Arrays_Utility {

    public static void main(String[] args) {


        // ============= ARRAY STRING=================  CONVERTS TO STRING VALUE
        int[] arr = {1, 2, 3};

        System.out.println(arr);

        System.out.println(Arrays.toString(arr));

        String s1 = Arrays.toString(arr);
        System.out.println(s1);

        String[] names = {"Muhtar", "Saim", "Nadir", "Asiya", "Kuzzat"};
        System.out.println(names);// in order to print array variable we MUST to convert into String variable

        System.out.println(Arrays.toString(names));
        System.out.println("==============================");


        //========== S O R T ======================   needs to sort arrays
        int[] nums = {5, 4, 6, 5, 4, 3, 10};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums); //[ 3, 4, 4, 5, 5, 6, 10    <=====

        System.out.println(Arrays.toString(nums));
        // the SORT must be done BEFORE
        System.out.println("Maximum number: " + nums[nums.length - 1]);
        System.out.println("Minimum number: " + nums[0]);

        System.out.println("===================================");


        String students[] = {"Mehdi", "Elkem", "Meee", "Trump"};
        // Elkem, Meee, Mehdi, Trump
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("================================");


        // ============EQUALS====================== compares arrays
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        boolean r1 = Arrays.equals(arr1, arr2);     // true
        System.out.println(r1);

        int[] arr3 = {2,1,3};
        Arrays.sort(arr2);
        Arrays.sort(arr3);

        boolean r2 = Arrays.equals(arr2,arr3);      // false === because not sorted
        System.out.println(r2);

        int[] arr4 = {1,1,2,3};
        int[] arr5 = {1,2,3};       // ALWAYS BE FALSE

        boolean r3 = Arrays.equals(arr4, arr5);
        System.out.println(r3);





    }
}
