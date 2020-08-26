package QUIZ;

public class quiz3 {
    public static void main(String[] args) {

        String a = "today i will go to the beasch";
        boolean b = a.contains("i");
        boolean c = a.substring(12).startsWith("go");

        String result = b && c ? "go" : "dont go";
        System.out.println(result);


        //=========
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i);
        }


        //--======

        int number = 5;
        while (number < 100) {
            number += number;
        }
        System.out.println(number);


        //=======


        int a1 = 0;
        do{
            a1 = a1++ + --a1-(a1%3);

        }while (++a1 < 4);
        System.out.print(a1);

        //=============

        String str = "the whole time it was raining";
        do {
            System.out.print(str.charAt(0));
            str = str.substring(3);
        }while (!str.isEmpty());


        //========


        String s = "I will find the lost book";
        String word = "";

        for (int index = s.length()-1; index <= 0; index--){
            word += s.charAt(index);
        }
        System.out.println(word);


        //=========

        String str2= "cybertek";
        for (int i=0; i <= str.length();i+=2){
            System.out.println(str.charAt(i));
        }


        String input = "today it will be 100 degrees  !";
        int n = 0;

        while (n++ < input.length()){
            if (n==8){
                continue;
            }else if (n==9){
                break;
            }
            System.out.print(input.charAt(++n));







        }

    }

}
