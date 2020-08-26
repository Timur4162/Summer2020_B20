package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicats {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('A','A','B','B','C','C'));

        System.out.println(list);

        ArrayList<Character> nonDup = new ArrayList<>(); // it's 0        at the end {A, B, C};

        for (Character each : list ) {   // 'A','A','B','B','C','C'

            if (!nonDup.contains(each)){ // KEY POINT HERE. of not contain you should add, contains = not add(skip) to the loop
                nonDup.add(each);
            }

        }


        System.out.println(nonDup);



    }
}
