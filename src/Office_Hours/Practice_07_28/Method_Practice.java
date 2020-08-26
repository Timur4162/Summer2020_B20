package Office_Hours.Practice_07_28;

import java.util.ArrayList;
import java.util.Arrays;

public class Method_Practice {
    public static void main(String[] args) {

        String name = "Timur Izbossinov";
        String reverseName = reverseStr(name); // can be assigned to variable for print

        System.out.println(reverseStr(name));
        System.out.println(reverseName);

        System.out.println(reverseName.toUpperCase());  // the advantage of it, that can be added in here

         Palindrome("Level");
         Palindrome(name);

        System.out.println("=====================================================");

        String[] names = {"Aslan", "Ramazan", "Bob", "Efran", "Alia", "Ayhan"};   // reverse ALL OF 'Em

        ArrayList<String>nameList = new ArrayList<>();  // EXTRA TASK

        for ( String each : names){

          //  System.out.println( reverseStr(each) );
          //  Palindrome(each);


            nameList.add( reverseStr(each)  );

        }

        System.out.println(nameList);

    }

    // Access - Modifier    Specifier       Return-Type         Name(Parameter)         { Statements }
    //      optional         optional        mandatory      meaning name of function
    //                                         value
    //                                         re-use

    public static String reverseStr(String str) {  //   A B C
        String result = "";  //ExpRes = C B A - to store the reverse order of STR - good for reUse

        for (int i = str.length() - 1; i >= 0; i--) {   // for reverse =i starts from length()-1
            result += str.charAt(i); // C   ==  C will be concates to the result
        }

        return result;

    }


    public static void Palindrome(String str){ // A B C

        String reversedStr = reverseStr(str); // C B A
        boolean palindrome = str.equalsIgnoreCase(reversedStr); //  == compares the object place also

        System.out.println( palindrome ? str + "- Is Palindrome" : str + "- Is not Palindrome" );
//                ternary              if  TRUE = prints        else - FALSE = Prints




    }


}
