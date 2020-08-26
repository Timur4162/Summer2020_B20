package day38_Java_Array_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class Methods {

    // remove, size set get equals contains clear

    public static void main(String[] args) {

        // ============ REMOVE ===== removes all the elements which are not MATCHING ======

        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW", "Mers", "Infinity", " Tesla", "VW", "LAmborghini", "Lexus", "mers", "Toyota"));

        System.out.println(cars);

        //    cars.remove("3");
        //    cars.remove("Tesla");
        //    cars.removeAll(Arrays.asList("Tesla"));
        //    cars.removeIf(p -> p.toLowerCase().contains("m"));
        //    cars.removeAll(Arrays.asList("Tesla"));
        System.out.println(cars);

        System.out.println("============================================");

        // ========= CONTAINS METHOD ==== checks the elements does they contains or not

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs", "Milk", "Paper towels", " Toilet paper", "Mango", "Orange", "Avocado", "Dragon Fruit"));
                                        // 1       2           3               4              5       6          7            8

        // Pepsi
        boolean r1 = groceryList.contains("Pepsi"); // going to check Pepsi in the List = does it contains or not
        System.out.println(groceryList);
        System.out.println(r1); // False

        // Eggs. Milk, Orange
        boolean r2 = groceryList.containsAll( Arrays.asList("Eggs", "Orange", "Milk", "Water")); // If one of 'em is not contained == FALSE
        //                              Collection type
        System.out.println(r2);  // False
        System.out.println("Total Number of Items: "+ groceryList.size()); // gives the size of Arraylist

        // set the dragon fruit to apple:

        groceryList.set(groceryList.size()-1, "Apple"); // gives the index number of the last element, replace the element
        System.out.println(groceryList);

        groceryList.set(groceryList.indexOf ("Paper towels"), "Dish Washer");
        System.out.println(groceryList);



    }
}
