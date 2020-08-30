package Office_Hours.Practice_08_26;

public class Palindrome2 {
    public static void main(String[] args) {

        String str = "kayak";
        System.out.println(str.equalsIgnoreCase(reverseStr(str)));

        System.out.println(isPalindrome("Fatih"));

        System.out.println( isPalindrome("Anna"));
    }


    public static String reverseStr(String str) { //  (String str) in that case MANDATORY
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }


    public static boolean isPalindrome(String str){
        return str.equalsIgnoreCase(  reverseStr(str));
    }
}
