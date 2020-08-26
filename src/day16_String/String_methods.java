package day16_String;

public class String_methods {
    public static void main(String[] args) {

        String email = "cybertek@gmail.com";
        email.replace("gmail", "yahoo"); // cybertek@yahoo.com
        System.out.println(email);


        String word = "java";
        word = word.replace("a", "e");     // "jeve"
        System.out.println(word);


        String sentence = "I like to learn Java, Java is cool, Java is fun";
        sentence = sentence.replace("a, Java", "a, C#");
        System.out.println(sentence);

        sentence = sentence.replace(" Java ", " Python ");
        System.out.println(sentence);

        String s1 = "I like to stay in Cybertek, Cybertek is nice place";  // MIT
        s1 = s1.replace("Cybertek", "MIT");
        System.out.println(s1);

        s1 = s1.replace("MIT", "Cybertek");
        System.out.println(s1);


        String s2 = "I like to leaRn Java";  // r
        s2 = s2.replace('R', 'r');   // replace R => r   gonna replace all of 'em.
        System.out.println(s2);

        String s3 = "Cybertek is cool place to learn, Cybertek is great";
        s3 = s3.replaceFirst("Cybertek", "MIT");            // replace ONLY THE FIRST word
        System.out.println(s3);

        String s4 = "I like to Watch Game of Thrones, and Walking dead";
        s4 = s4.replace(", and Walking dead", "");
        System.out.println(s4);


        // indexOf()
        String s5 = "I like to stay in cybertek, we are learning java";
        int r1 = s5.indexOf("r");
        int r2 = s5.indexOf("re");
        int r3 = s5.indexOf("rn"); // returns the first char 'r' index
        System.out.println(r1);
        System.out.println(r2);

        // lastIndexOf()  -   returns the index number of the last occured character. as an int
        String s6 = "Java is a programming language, and Java is fun";
        int I1 = s6.indexOf("J");
        int I2 = s6.lastIndexOf("J");
        System.out.println(I1);
        System.out.println(I2);

        //indexOf() returns the index if first occured character. as an int
        String s7 = "Java";
        int a1 = s7.indexOf("A");
        System.out.println( a1);

        String s8 = "Java";
        int a = s8.indexOf("a");

        char ch = s8.charAt(a);







    }
}
