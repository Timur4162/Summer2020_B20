package Office_Hours.Practice_08_25;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Review {
    public static void main(String[] args) {


        // ======== ADD METHOD ==========

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        System.out.println(list1);

        int[] nums1 = {80, 90, 100};
        Integer[] nums2 = {80, 90, 100};

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list1);
        list2.addAll(Arrays.asList(50, 60, 70, 80));// Arrays.asList=> converts the objects in Collection Type
        list2.addAll(Arrays.asList(nums2));
        //     list2.addAll(Arrays.asList(nums1));   ===> Collections does not support primitives


        System.out.println(list2); // 10 20 30 40 50 60 70 80 80 90 100


        // ======   REMOVE METHOD   =======
        // will use when clearly known the objects


        list2.remove(8); // primitive. In that case the matching index will be removed
        System.out.println(list2); // 10 20 30 40 50 60 70 80 90 100

        // list2.remove(80);
        // System.out.println(list2); // Out of Bound Exception. Size = 10

        Integer a = 90;  // to remove 90 needs to assign the value
        list2.remove(a);
        list2.remove(new Integer(90)); // SECOND VARIANT - remove the Integer object
        list2.remove(new Integer(30));
        System.out.println(list2); // will remove 30, 90

        list2.removeAll(Arrays.asList(40, 50, 60));// removeAll par of Bulk Operation

        // ===  REMOVES when conditions known ======
        list2.removeIf(p -> p > 50);
        System.out.println(list2);


        list2.addAll(Arrays.asList(40, 50, 100, 200, 300, 100, 100, 100));
        System.out.println(list2);

        // === RETAIN ==== it means KEEP
        list2.retainAll(Arrays.asList(100, 200, 300));
        System.out.println(list2);
        System.out.println("Size: " + list2.size());

        list2.clear();
        System.out.println(list2);
        System.out.println(list2.isEmpty());
        System.out.println("Size :" + list2.size());

        System.out.println("=================================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));


        //list3.set(list3.size()-1,30); // last element will be replaced
        System.out.println(list3);

        for (int i = 0; i <= list3.size() - 1; i++) {
            Integer each = list3.get(i);
            if (each % 2 != 0) {
                list3.set(i,each * 2);  // IF ODD NUMBER multiply by 2

            }else {
                list3.set(i, each * 3);
            }

        }

        System.out.println(list3);
        System.out.println("=====================================");

        ArrayList<String>  countries = new ArrayList<>();
        countries.addAll( Arrays.asList("America", "England", "Australia", "New Zeland", "Russia", "Canada") );

        //countries.removeIf(  c ->   c.endsWith("d")   );
        //  countries.removeIf(  c ->   c.charAt( c.length()-1  )  ==  'd'  );
        //                          last char from c          ==  'd'

        //  countries.removeIf( c -> c.startsWith("A") );

        countries.removeIf(  c ->   c.charAt( 0 )  ==  'A'  );

        System.out.println(countries);

    }
}
