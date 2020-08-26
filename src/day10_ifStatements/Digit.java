package day10_ifStatements;

public class Digit {
    public static void main(String[] args) {
        char character = '1';

        // 47 <= character <= 47

        boolean isDigit = character >= 48 && character <= 57;

        String digit = "";
        if(isDigit==true){
            digit = character+" is a digit";
        }else {
            digit = character+" is not a digit";
        }
        System.out.println(digit);







    }

}
