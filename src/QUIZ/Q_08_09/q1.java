package QUIZ.Q_08_09;

import java.util.ArrayList;
import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1); // 0
        list1.add(2); // 1
        list1.add(3); // 2

        Integer a=1;  // int a = 1 ====>  [1,3] int a = 1 ==> removes index 1, when INTEGER removes 2
        list1.remove(a);//  remove 1, which a.
        System.out.println(list1);
//==================
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        list.set(0,list.get(4));
        list.set(4, list.get(0));

        System.out.println(list);//   ?

    }
}
