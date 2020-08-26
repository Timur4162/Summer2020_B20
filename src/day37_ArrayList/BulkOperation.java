package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperation {    // ONLY ACCEPT THE COLLECTION TYPE  !!!
    public static void main(String[] args) {

//  ===============  CONTAINS ALL ==================
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        boolean r1 = list.contains(1); // true

        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(5);  // = 5 not contained in the LIST, so compiler returns FALSE

        boolean r2 = list.containsAll(elements);
        System.out.println(r2);

        System.out.println("========================================");

        // =========== CONTAINS ALL =============
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        // verify that 1, 2, 4 are contained in the list2

        boolean r3 = list2.containsAll(Arrays.asList(1, 2, 4));  // takes as ARRAY and returns as the CollectionType
        //   looks if contains 1,2,4 or not === BOOLEAN. If 1 number not contain, returns => FALSE

        // ===== SECOND VARIANT of AS.LIST METHOD  =======
        Integer[] arr = {10, 20, 4};
        boolean r4 = list2.containsAll(Arrays.asList(1, 2, 4));


        System.out.println(r3);
        System.out.println(r4);
        System.out.println("====================================");

        ArrayList<Integer> numbers = new ArrayList<>();

        // need to add 30,25,40,15,55,65,75,85,95,100
        /*
         Integer[] nums = {30,25,40,15,55,65,75,85,95,100};
         */


        numbers.addAll(Arrays.asList(30, 25, 40, 15, 55, 65, 75, 85, 95, 100));
        System.out.println(numbers);
        System.out.println("=======================");


        // ===========  REMOVEALL =================
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 1, 1, 1, 11, 12, 2, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 10, 11, 12, 13));
        System.out.println(nums);
        // remove al 1,2,5,10,11

        nums.removeAll(Arrays.asList(1, 2, 5, 10, 11)); // remove all the 1'
        System.out.println(nums);


        // ===============   RETAIN ALL =================

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.addAll(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9));
        System.out.println(num1);
        // only keep the elements that either 1, or 2, or 3, or 9
        num1.retainAll(Arrays.asList(1,2,3,9));  //    remove also if not match
        System.out.println(num1);

    }
}
