package day20_WhileLoops;

public class REVERSE_A_STRING_LOOP {
    public static void main(String[] args) {

        String str = "Cybertek";
        //            01234567

        String result = "";

        int index = str.length()-1;
        while (index >= 0) {

            result += str.charAt(index);
            index--;
        }
        System.out.println(result);


    }
}
