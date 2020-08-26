package day11_Nestedif_Ternary;

public class DaysInMonth2 {
    public static void main(String[] args) {
        /*
        write a programm that can find the number of days in a month
         */

        int month = 3;
        boolean validNumber = month >= 1 && month <= 12;
        boolean days28 = month == 2; // for the month that has 28 days
        boolean days30 = month == 4 || month == 6 ||month == 9 || month == 11;
        // for the month that has 30 days
        String result = "";

        if(validNumber){
            if(days28){
                result = "28 days";
            }else if(days30){
                result = "30 days";
            }else{
                result = "31 days";
            }

        }else{
            result = "Invalid";                    //   invalid days
        }
        System.out.println(result);




    }


}
