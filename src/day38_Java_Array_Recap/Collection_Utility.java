package day38_Java_Array_Recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collection_Utility {

     /*
        Collection Class:
        Collection.sort();
        Collection.swap();
        Collection.frequency();

     */

    public static void main(String[] args) {

        //============ COLLECTION SORT ======= sort by ascending order

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('R','S','O','P','A','C','B'));

        System.out.println(chars);

        Collections.sort(chars);

        System.out.println(chars);


        // ==============   COLLECTION SWAP ===== swap the elements on the ArrayList

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Aslan", "Cristina", "Zeliha", "Iman", "Fatima", "Mohammad"));
        //                              0           1          2        3        4         5
        // wants to swap Cristina and Fatima

        Collections.swap(students, 1,4);
        Collections.swap(students, 1,4); // if swap second gives the original list ==== CTRL+Z
        System.out.println(students);

        Collections.swap(students, 0, students.size()-1); // can be used the IndexOf. also
        System.out.println(students);



        // ==============   FREQUENCY ==== how many times occurs the elements

        ArrayList<String> items = new ArrayList<>();
        items.addAll( Arrays.asList("Coffee", "Coffee", "Egg", "Battery", "Battery", "Battery"));

        int count = Collections.frequency(items, "Battery"); // need to assign to variable INT
        System.out.println(count);

        //===== FIND THE UNIQUE ==== need to use the LOOP
        ArrayList<String> unique = new ArrayList<>();

        for (String each : items) { // frequency of each element
            int i = Collections.frequency(items, each); // i = represents the frequency
            if (i == 1){ // if frequency is 1 time = means its UNIQUE
                unique.add(each);
            }
        }

        System.out.println(unique); // Egg


        //=========  ANOTHER WAY TO FIND UNIQUE=====

        ArrayList<String> unique2 = new ArrayList<>();
        unique2.addAll(items);  // added the items from previous
        unique2.removeIf( p -> Collections.frequency(unique2,p) > 1);// called the frequency method

        System.out.println(unique2);


        // ============= MAX and MIN ===========

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,56,57,878,8,54,2000,4000,453,76,-20,100,100,100,100));

        Integer max = Collections.max(list); // calls the max number
        Integer min = Collections.min(list);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        // ============= REPLACE ==========

        Collections.replaceAll(list, 100, 777); // all 100 will be replaced with 777
        System.out.println(list);










    }
}
