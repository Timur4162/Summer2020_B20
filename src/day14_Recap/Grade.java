package day14_Recap;

import java.util.Scanner;

public class Grade {
    /*
    write a program that can caluclate the garade of the student based on the given score
                        90 <= score <= 100 ==> Excellent
                        80 <= score <= 89 ==> Great
                        70 <= score <= 79 ==> Good
                        60 <= score <= 69 ==> Passed
                        0 <= score <= 59 ==> Failed
                        other == > Invalid Entry
                MUST use Scanner and nested IF

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double score = scan.nextDouble();

        String result = "";

        if (score >= 0 && score <= 100) {   // if true = 5 possible outcomes

            if (score >= 90) {              // compiler checks if the previous is true
                result = "Excellent";
            } else if (score >= 80) {       // && score<90){    // checks when the previous is FALSE
                result = "Great";
            } else if (score >= 70) {       // && score<80){   // checks when the previous is FALSE = when less than 80
                result = "Good";
            } else if (score >= 60) {
                result = "Passed";
            } else {
                result = "failed";
            }


        } else {
            result = "invalid Entry"; // if false = 1 possible outcome


        }
        System.out.println(result);

    }

}
