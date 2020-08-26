package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class INTERVIEW_QUESTION {

    public static void main(String[] args) {

        // Remove all names Ahmet from the ArrayList

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmet", "Muhtar", "Ahmet", "Virginia", "Beslan", "Ibrahim","Ahmet"));

        System.out.println(employees);

        employees.removeAll( Arrays.asList("Ahmet"));  // REMOVES MATCHING ELEMENTS
        System.out.println(employees);

        employees.retainAll(Arrays.asList("Ahmet")); // REMOVE NOT MATCHING ELEMENTS
        System.out.println(employees);




    }
}
