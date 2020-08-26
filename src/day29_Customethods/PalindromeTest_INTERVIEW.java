package day29_Customethods;

public class PalindromeTest_INTERVIEW {
    public static void main(String[] args) {
        palindrome("redivider");
    }

    /*
    kayak  ===> kayak  true
    java   ===> avaj   false
    */

    public static void palindrome(String word){
        String reversed = "";

        for (int i = word.length()-1; i>=0; i--){
            reversed += word.charAt(i);
        }
        System.out.println( reversed.equalsIgnoreCase(word) );
    }

}
