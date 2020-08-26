package day19_ForLoop;

import java.util.Scanner;

public class PalindroneTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        // String str = "kakot";

        String reversedStr = "";
        for (int i = str.length()-1; i >= 0; i--){
            reversedStr += str.charAt(i);
        }
        System.out.println(reversedStr);
        System.out.println(str.equals(reversedStr));












    }
}
