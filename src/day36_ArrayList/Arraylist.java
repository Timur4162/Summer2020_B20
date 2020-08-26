package day36_ArrayList;

import java.util.ArrayList;
/*
    indexOf();
    lastIndexOf();
    contains();
    equals();
    isEmpty();

 */
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10); // 0
        list1.add(20); // 1
        list1.add(30); // 2
        list1.add(40); // 3
        list1.add(50); // 4
        list1.add(40); // 5

        int a = list1.indexOf(40);

        System.out.println(a); // 3

        System.out.println( list1.lastIndexOf(60)); // 60 is not exist in the list   -1

        System.out.println(list1.lastIndexOf(40));  // 5

        boolean r1= list1.contains(100);

        System.out.println(r1);// false

        System.out.println("=====================================================");

        ArrayList<String> list = new ArrayList<>();
        list.add("Cybertek");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Cybertek");

        System.out.println(list);
        System.out.println(list2);

        // "==" - checks the memory location. IGNORECASE IS NOT WORKING

        System.out.println(list.equals(list2));  // KEY SENSITIVE

        System.out.println("======================================================");

        ArrayList<Integer> list3 = new ArrayList<>();
        System.out.println(list3.isEmpty()); // true or false





    }
}
