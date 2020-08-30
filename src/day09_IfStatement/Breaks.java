package day09_IfStatement;

public class Breaks {

    public static void main(String[] args) {


        String itsBreakTime = "Yes";

        if (itsBreakTime == "No") {
            System.out.println("You can take 15 minutes of break");
        } else {
            System.out.println("Continue the class");
        }

        System.out.println("===================================");


        int a = 100;
        int b = 200;

        if (a > b) {
            System.out.println(a + " is greater");
        } else {
            System.out.println(b + " is greater");
        }

    }
}
