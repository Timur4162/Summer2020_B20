package day29_Customethods;

import sun.lwawt.macosx.CFRetainedResource;

public class eligibility {
    public static void main(String[] args) {


        vote("Timur", 34, true, "Biden");
        vote("Eliza", 1, true, "Trump");
        eligibleToBuyAlcohol(true, 4);
        calculater(10,'*',9);
    }

    /*
    age, citizen, name
    to buy alcohol
     */
    public static void eligibleToBuyAlcohol(boolean hasID, int age) {
        if (hasID && age >= 21) {
            System.out.println("You are eligible to buy alcohol");
        } else {
            System.out.println("You eligible to buy MILK");
        }
    }

    public static void vote(String name, int age, boolean citizenship, String candidatesName) {
        boolean eligibleToVote = age >= 18 && citizenship == true;
        if (eligibleToVote) {
            System.out.println(name + " is eligible to vote for " + candidatesName);
        } else {
            System.out.println(name + " not eligible to vote");
        }
    }


    public static void calculater(double num1, char operator, double num2) {
        // +  -  *  /  %  INVALID    ==== operators  = === must use multibranch if statements or SWITCH

        switch (operator) {

            case '+':
                System.out.println("Addition: " +(num1+num2));
                break;
            case '-':
                System.out.println("Subtraction: "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication: "+(num1*num2));
                break;
            case '/':
                System.out.println("Division: "+ (num1/num2));
                break;
            case '%':
                System.out.println("Remainder: "+(num1%num2));
                break;

            default:
                System.out.println("Invalid operator");
        }


    }


}
