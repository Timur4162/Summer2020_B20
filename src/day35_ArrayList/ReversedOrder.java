package day35_ArrayList;

import java.util.ArrayList;

public class ReversedOrder {
/*
  1. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
 */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);  //  autoboxing   0
        list.add(20);   //              1
        // list.add(3,30); cannot skip the elements
        list.add(1,30);//  2
        list.add(40);   //              3
        list.add(50);   //              4

        System.out.println(list.size());
        System.out.println(list);

    /*    for (int i = 4; i >= 0; i--){
            System.out.print(list.get(i)+" ");
      */
        for (int i = list.size()-1; i >= 0; i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();




    }



}
