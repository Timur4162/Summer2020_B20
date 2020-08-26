package day36_ArrayList;

import java.util.ArrayList;

/*
write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}
 */
public class UniquesInArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(); // {1,1,2,3,3}
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        ArrayList<Integer> uniques = new ArrayList<>(); // {2}


        for (int i = 0; i <= list.size() - 1; i++) { // OUTER LOOP = gets each of the ELEMENT, For each can be apply too

    //  for (Integer element : list){  in that case Integer element - variable doesn't need anymore

            Integer element = list.get(i); // needs to compare with every element in ArrayList {1,1,2,3,3} == LOOP

            int count = 0;
            for (Integer each : list) {  // LOOP = to the frequency of each the ElEMENT
                if (each == element) {  // IF = to verify if the element is UNIQUE
                    count++;
                }
            }
            if (count == 1) {
                uniques.add(element);
            }


        }
        System.out.println(uniques);
    }

}
