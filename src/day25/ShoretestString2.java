package day25;

public class ShoretestString2 {
    public static void main(String[] args) {

        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet"};

        // arr[0] = gives a String

        int minLength =  arr [0].length();      //  4


        //  1 )   ========= this LOOP to find the MINIMUM number of ARR (SHORTEST STRING)==============

        for ( String each  : arr){
            int l = each.length();   // 4 8 4 8

            if (l < minLength){
                minLength = l;
            }
        }

//               ========= HOW MANY STRINGS MATCHING WITH minLength   =============
        for (String each : arr){
            if (each.length()==minLength){
                System.out.println(each);    // Anam  Amir
            }
        }













    }
}
