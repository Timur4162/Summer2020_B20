package QUIZ.Q_08_09;

import java.util.ArrayList;
import java.util.Arrays;

public class q2 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Rob");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");

        if (names.remove("Bran")){
            names.remove("John");
        }
        System.out.println(names); //  ?
        System.out.println("=========================================================");

//==============
        ArrayList<String> colors = new ArrayList<>();

        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add(3, "cayn");

        System.out.println(colors); //  ?




        //=========

        ArrayList<Integer> list = new ArrayList<>();
        Integer a = 1;
        System.out.println(list.remove(a)); // ?


        System.out.println("========================================");

        ArrayList<Character> list1 = new ArrayList<>();
        for (char i = 'a'; i <= 'z'; i++){
            list1.add(i);
        }
        System.out.println(list1);

        //a, c, D

        boolean result = list1.containsAll(Arrays.asList('c','a','d'));
        System.out.println(result);

    }


}
