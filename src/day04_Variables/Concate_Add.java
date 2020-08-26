package day04_Variables;

public class Concate_Add {

    public static void main(String[] args) {
        // addition: number + number
        System.out.println(12 + 13); //25
        System.out.println( 'A' + 2); //A67  cos it has a character and number
        System.out.println( 'A' + 'B'); //131 letters converts in digits A B became a number ASCII

        // concetination: append
        System.out.println("12" + 13); //1213  cos 1 is a number another is a String
        System.out.println("A" + 2); //67   concate to s String,
        System.out.println("Gender " + 'M'); //Gender M
        System.out.println("Tax " + 3.5 + "%"); //Tax 3.5%

        System.out.println(3.5 + '%'+"Tax ");//3.5+37+"Tax"



    }





}
