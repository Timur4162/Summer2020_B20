package day26_MultiDimesionalArray;

import java.util.Arrays;

//  1. write a program that can sort the array in descending order

public class SortDescending {
    public static void main(String[] args) {

        String sentence = "Java Java Python Python";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));
        int countJava = 0;
        int countPython = 0;

        for(String each  : words){
            if(each.toLowerCase().contains("java")){
                countJava++;
            }else if(each.toLowerCase().contains("python")){
                countPython++;
            }

        }

        System.out.println("Java: "+countJava);
        System.out.println("Python: "+countPython);

        System.out.println( countJava == countPython);

        /*
        str = JavaScript
        str.equals(Java) ==>false
        str.contains("Java") ==> true
         */


    }
}
