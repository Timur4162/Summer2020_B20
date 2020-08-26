package Office_Hours.Practice_07_15;

import java.util.Scanner;

// This programm counts how many times JAVA appears /
public class Frequency_Of_Words2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();

      //  String str = "JavajavajavajavaJAVA".toLowerCase();
     //    or can be converted by this way ===>    str = str.toLowerCase();
        //                  str = "javajavajavajava"    1 time
        //                  str = "javajavajava"        2 time
        //                  str = "javajava"            3 time
        //                  str = "java"                4 time
        //                  str = " "       and last time of execution


        int count = 0;
        while (str.contains("java")){   // <=== condition is true, executes next true, true, true, true
            count++;   // increases the count by 1
            str = str.replaceFirst("java", "");// removes one java from string
        }

        System.out.println(count);








    }
}
