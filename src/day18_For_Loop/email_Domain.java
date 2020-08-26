package day18_For_Loop;

import java.util.Scanner;

/*
write a program that will return the domain of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo
 */
public class email_Domain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        // String email = "cybertek@yahoo.com";  // works with another kind of Domains
                      //012345678
        int index1 = email.indexOf("@");
        System.out.println(index1);         //  8

        int index2 = email.lastIndexOf(".");            // indexOf    works too
        System.out.println(index2);         //  14

        String result = email.substring(index1+1,index2);
        System.out.println(result);

    }

}
