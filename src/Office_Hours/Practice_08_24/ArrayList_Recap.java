package Office_Hours.Practice_08_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
addAll;
removeAll;
retainAll;
containAll;
 */
public class ArrayList_Recap {

    public static void main(String[] args) {


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        System.out.println(list1);

        for (Integer each : list1) {
            System.out.print(each);
        }
        System.out.println();
        System.out.println("============================================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(30, 40, 50, 60, 70, 80, 90, 100, 200));


        //  REMOVE: 40,50,90,200

        list2.removeAll(Arrays.asList(40, 50, 90, 200));
        System.out.println(list2); // 30 60 70 80 100


        // SWAP ELEMENTS
        Collections.swap(list2, 0, list2.size() - 1);
        System.out.println(list2);


        // GET
        System.out.println(list2.get(0)); // 100
        System.out.println(list2.get(list2.size() - 1)); // 30


        // SET   arr[0] = 300
        list2.set(0, 300);

        System.out.println(list2);

        Collections.sort(list2);
        System.out.println(list2);

        System.out.println();
        System.out.println("============================================");


        // INTERVIEW TASK
        //REMOVE NAME   ========   PRADICATE METHOD
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmet", "Elkem", "Cristina", "Anton", "Ahmet", "Ahmet"));

        names.removeIf(p -> p.equals("Ahmet"));
        System.out.println(names);


        // REMOVE WHO NOT PASSED = FAILED == LESS then 60
        ArrayList<Integer> grades = new ArrayList<>();
        grades.addAll(Arrays.asList(50, 65, 45, 55, 75, 85, 95, 98, 100, 87, 40, 52, 62, 35));

        grades.removeIf(p -> p < 60); //   p -> p <60 || p >= 70
        System.out.println(grades);


        // RETAIN == opposite if removeALL
        ArrayList<String> students  = new ArrayList<>();
        students.addAll(Arrays.asList("Viorel", "Askat", "Ziadin","Dilyafrus","Mehray","Ziadin"));

        // Askar, Ziadin

        students.retainAll(  Arrays.asList("Askat", "Ziadin"));
        System.out.println(students); // Askat, Ziadin, Ziadin
        // KEEPS the names which MATCHING




    }
}
