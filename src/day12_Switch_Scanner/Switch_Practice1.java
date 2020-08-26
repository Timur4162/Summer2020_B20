package day12_Switch_Scanner;

public class Switch_Practice1 {

    public static void main(String[] args) {

        int num = 6;
        String day = " ";

        switch(num){
            case 5:
                day = "Friday";               //System.out.println("Friday");
                break;

            case 1:
                day = ("Monday");              // System.out.println("Monday");
                break;

            case 2:
                day = ("Tuesday");            //System.out.println("Tuesday");   e t c
                break;

            case 6:
                day = ("Saturday");
                break;

            case 4:
                day = ("thursday");
                break;

            case 3:
                day = ("Wednesday");
                break;

            case 7:
                day = ("Sunday");
                break;

            default:
                day = "invalid day";



        }

        System.out.println(day);

    }


}
