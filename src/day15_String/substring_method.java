package day15_String;

public class substring_method {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        //                 0123456789..
        String word = sentence.substring(0 , 3+3);
        System.out.println(word);

        String word2 = sentence.substring(8,11);
        System.out.println(word2);

        System.out.println("=========================");
        String firstName = "tiMuR";
        String firstCharacter = firstName.substring(0,1);
        System.out.println(firstCharacter);
        String rest = firstName.substring(1,firstName.length()); //<=last index+1
        System.out.println(rest);

        firstName = firstCharacter.toUpperCase()+rest.toLowerCase();
        System.out.println(firstName);


        System.out.println("=====================================");
        String lastName = "school";
        String firstChar = lastName.substring(0,1); // s
        String remaining = lastName.substring(1); // chool

        lastName = firstChar.toUpperCase() + remaining.toLowerCase();// School
        System.out.println(lastName);
        System.out.println(firstChar);
        System.out.println(remaining);

        String s = "I like Game of Thrones";
        //          01234567890
        String series = s.substring(7);
        System.out.println(series);

        String s2 = "I like Java programming language";
        //           0123456789..
        String language = s2.substring(7);
        System.out.println(language);


    }
}
