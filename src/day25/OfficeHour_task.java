package day25;

public class OfficeHour_task {
    public static void main(String[] args) {

        String str = "OOPQQ";   // O2P1Q2   1) Need to replace the duplicats 2) every character needs to go to nonDup
        String nonDup = ""; // OPQ


        // REMOVE DUPLICATES
        for (int i = 0; i <= str.length() - 1; i++) {   // i++  ===> makes the condition FALSE, chto by NOT INFINITE
            //          i <= 4
            String s = "" + str.charAt(i);    // executes 1) O 2) O 3) P 4) Q 5)Q
            if (!nonDup.contains(s)) {       // if the character isn't already exist then we can concate it to String

                // nonDup = OPQ     ====> str =  OOPQQ =====> O2P1Q2


            }
        }
        String result = "";
        char ch1 = nonDup.charAt(0);   // 0
        int count1 = 0;  //  1 + 1 (matching with the 1st character)

        for (int i = 0; i <= str.length() - 1; i++) { // counting the frequency
            str.charAt(i);  // executes O O P Q Q
            char each = str.charAt(i);
            if (each == ch1){
                count1 +=1;
            }
        }
        result += ""+ch1+count1;
        System.out.println(result);

    }
}
