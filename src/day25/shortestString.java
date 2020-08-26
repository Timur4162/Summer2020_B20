package day25;

public class shortestString {
    public static void main(String[] args) {

        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Abi", "Ali", "Joe"};

       // arr[0] = gives a String

        int minLength =  arr [0].length();      //  4


        //  1 )   ========= this LOOP to find the MINIMUM number of ARR (SHORTEST STRING)==============

        for (int i = 0; i <= arr.length-1; i++){
            int l = arr[i].length();   // when i=0 ==> int l= 4; when i =2 ==> int l = 8;  e t c ==> 4; ==>  8;

            if (l < minLength){
                minLength = l;
            }
        }

//               ========= HOW MANY STRINGS MATCHING WITH minLength   =============
        for (int i = 0; i <= arr.length-1; i++){
           if (arr[i].length()==minLength){
               System.out.println(arr[i]);    // Abi Ali Joe
           }
        }






    }
}
