package day16_String;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you employeed?");
        String answer = scan.next();       //+  .toLowerCase();   can be added and convert to lower case letter

        if(answer.equalsIgnoreCase("yes")){    // ignoring key sensetivity
            System.out.println("Employeed");
        }else{
            System.out.println("Not employeed");
        }




    }
}
