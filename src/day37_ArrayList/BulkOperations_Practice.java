package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {
    public static void main(String[] args) {

//Contains.all = verify if all elements are contains in the LIST

        ArrayList<String> students = new ArrayList<>();
        students.add("Sayeem");
        students.add("Wagar");
        students.add("Beslan");
        students.add("Dawut");
        students.add("Ramazan");
        students.add("Mehary");

        // Verify that the names: Ulku, Busra are contained in students list

        boolean r = students.containsAll(Arrays.asList("Ulku", "Busra") );
        System.out.println(r);

        System.out.println("=======================================");

        ArrayList<String> group1 = new ArrayList<>();

        // add all student names in your group
        group1.addAll( Arrays.asList("Muhtar", "Nadir", "Asiya", "Saim"));

        // verify your mentor and one of your closest friend' names are contained in the list
        group1.containsAll( Arrays.asList("Mike"));



    }
}
