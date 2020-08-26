package day11_Nestedif_Ternary;

public class Ternary_practiceOnLunchTime {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        // output: b is greater

      /*  String result = "";

        if(a<b){
            result = "B is greater";
        }else {
            result = "A is greater";
        }

        System.out.println(result);

       */

        String r = (a<b)?"a is greater":(b<a)?"b is greater":"a is equal to b";
        System.out.println(r);


        String result2 =(a<b)? "B is greater" : "A is greater";
        System.out.println(result2);

        System.out.println("=====================================");


        int a2 = 30;
        int b2 = 10;

        String result3 = (a2<b2)? "B is greater":"A is greater";
        System.out.println(result3);

        System.out.println("=================================");

        int a3 = 10;
        int b3 = 20;
        String result4 = (a3==b3) ? "a is equal to b":"not equal";
        System.out.println(result4);












    }



}
