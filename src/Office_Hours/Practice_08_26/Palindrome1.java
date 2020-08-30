package Office_Hours.Practice_08_26;

public class Palindrome1 {
    public static void main(String[] args) {


        // to make sure its Palindrome or not we need first REVERSE A STRING, then COMPARE WITH ORIGINAL

        String name = "level";
        //             01234

        String reversedName = "";
        for ( int i = name.length()-1; i >= 0; i--) {
            reversedName += name.charAt(i);
        }

        System.out.println( name.equalsIgnoreCase(reversedName));

        String word = "Elmira";

        String reversedWord = "";
        for (int i = name.length()-1; i >= 0; i--) {
            reversedWord += name.charAt(i);
        }
        System.out.println(word.equalsIgnoreCase(reversedWord));
    }
}
