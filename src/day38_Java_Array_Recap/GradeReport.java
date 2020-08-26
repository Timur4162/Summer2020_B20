package day38_Java_Array_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(); // <= ARRAYlist is the CLASS   ||  LIST is the CollectionType
        list.addAll(Arrays.asList(100, 96, 95, 86, 87, 88, 100, 85, 90, 69, 78, 45, 73, 35, 44, 23, 47, 60, 77, 93, 83, 53, 43, 63));
        //   BULK OPERATION = EXCEPT ONLY COLLECTION TYPE
        // Arrays.asList = return as a collection Type (200,...) <= you can as much as you want

        //   System.out.println(list.toString()); // to print the ArrayList
        System.out.println(list);       // prints the same


        ArrayList<Integer> gradeA = new ArrayList<>();  // 90 ~ 100   NEED TO USE REMOVEif method
        gradeA.addAll(list); // first = store all the grades into this LIST
        gradeA.removeIf(each -> each < 90);  // removes the Grades that are not A, or what less then 90
        // each represents all element from ArrayList
        System.out.println("Grade A: " + gradeA);


        ArrayList<Integer> gradeB = new ArrayList<>();  // 80 ~ 89
        gradeB.addAll(list);
        gradeB.removeIf(p -> p < 80 || p > 89);
        System.out.println("Grade B: " + gradeB);


        ArrayList<Integer> gradeC = new ArrayList<>();  // 70 ~ 79
        gradeC.addAll(list);
        gradeC.removeIf(p -> p < 70 || p > 79);
        System.out.println("Grade C: " + gradeC);


        ArrayList<Integer> gradeD = new ArrayList<>();
        gradeD.addAll(list);
        gradeD.removeIf(p -> p < 60 || p > 69);
        System.out.println("Grade D: " + gradeD);


        ArrayList<Integer> gradeE = new ArrayList<>();
        gradeE.addAll(list);
        gradeE.removeIf(p -> p < 0 || p > 59);
        //      gradeE.removeAll(gradeA);
        //      gradeE.removeAll(gradeB);
        //      gradeE.removeAll(gradeC);
        //      gradeE.removeAll(gradeD);
        System.out.println("Failed = E: " + gradeE);

        System.out.println("==============================");

        System.out.println(gradeA.size()+" students made A");
        System.out.println(gradeB.size()+" students made B");
        System.out.println(gradeC.size()+" students made C");
        System.out.println(gradeD.size()+" students made D");
        System.out.println(gradeA.size()+" failed");

    }
}
