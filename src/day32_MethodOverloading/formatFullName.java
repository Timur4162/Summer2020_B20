package day32_MethodOverloading;

import java.util.Scanner;

public class formatFullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String first = scan.nextLine();     // "cRisTina";
        String last =  scan.nextLine();     //"TISCEnco";
/*

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        // converts first char to upper case        // converts rest of char to lower

        last = last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();

        String fullName = first + " " + last;

        System.out.println(fullName);

*/

        String fullName = formatFullName(first,last);
        System.out.println(fullName);

    }

    public static String formatFullName(String first, String last){
        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
        String fullName = first + " " + last;

        return fullName;
    }

}
