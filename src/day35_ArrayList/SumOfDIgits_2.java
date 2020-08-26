package day35_ArrayList;


// the same TASK but DIFFERENT APPROACH

public class SumOfDIgits_2 {
    public static void main(String[] args) {
        String str = "a1b2c3";

        int sum = 0;
        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                sum += Integer.parseInt(each + "");
            }
        }           // isDigit(char) = verifies if the char is digit,   returns BOOLEAN
                    // isLetter(char)= verifies if the char is letter,  returns BOOLEAN

        System.out.println(sum);
    }
}
