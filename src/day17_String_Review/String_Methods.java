package day17_String_Review;

public class String_Methods {

    public static void main(String[] args) {

        // CHAR AT METHOD = === counts the index

        // charAt(index number); ==> returns CHAR
        String str = "Cybertek";
        //            01234567
        char ch1 = str.charAt(1);
        System.out.println(ch1);


        // + CONCATINATION
        String str2 = "Cybertek";
        str2 = str2 + " School";        // concat words    +++++
        System.out.println(str2);


        // LENGTH METHOD         COUNT THE CHARACTERS in the STRING, and returns as an INT
        String str3 = "Cybertek School";
        //     01234567891011121314
        //last index means = legth  -1
        int l = str3.length();
        System.out.println(l);   // 8   starts from 1

        char ch2 = str3.charAt(l - 1);    // str3.length()-1 ==? 15 -1 ===>14
        System.out.println(ch2);
        System.out.println("last index: " + (l - 1));


        // UPPERCASE & LOWERCASE
        // converts the string to upper or lower case, will create a new string for that, not a modifying the object
        String str4 = "cybertek";
        str4 = str4.toUpperCase();     // gives "CYBERTEK"
        System.out.println(str4);

        String str5 = "CYBERTEK";    // str5 <== needs to be assigned to operator
        str5 = str5.toLowerCase(); // "cybertek" it is a new string
        System.out.println(str5);


        // TRIM () removes the unused spaces
        String str6 = "    Cybertek     ";  // will removes the spaces which are not separating a words
        str6 = str6.trim();            //"Cybertek"        <== NEEDS TO BE ASIGNING TO A VARIABLE
        System.out.println(str6);       // extra spaces between 2 words will not be removed


        // SUBSTRING METHOD === one form
        String str7 = "I like Java Language";
        //             012345678910.12
        String word = str7.substring(7, 10 + 1);  // <== the ending index is always excluded,
        // because needs include one more index
        System.out.println(word);       // (7, 10) ==Jav    (7, 10+1) == Java
        System.out.println(str7);

        // second form
        String word2 = str7.substring(12, str7.length() - 1 + 1);  // last index excluded, needs to be add one more
        String word3 = str7.substring(12);    // from beginning till the end
        System.out.println(word2);
        System.out.println(word3);  // the same print with word3, but easier

        String word4 = str7.substring(2, 5 + 1);   // if want LIKE = one word from sentence
        System.out.println(word4);


        //indexOf =====> the first matching one   ==> int   index cannot be decimal
        String str8 = "Hello Batch 20, have a Wonderful day, We are happy to see you"; //  = W
        int i1 = str8.indexOf("W");
        System.out.println(i1);
        System.out.println(str8.charAt(i1));

        int i2 = str8.indexOf(", W") + 2;   // must be uniq to be printed the second W / add the character before W
        int i3 = str8.indexOf("We"); // can be added as much as you want to make it uniq

        System.out.println(i2); //  38
        System.out.println(i3); //  38


        // lastIndexOf  ===> prints the last matching one
        String str9 = "Java Java Java";
        int i4 = str9.lastIndexOf("J");     // 10
        int i5 = str9.indexOf("J");             // 0
        int i6 = str9.indexOf(" Java ") + 1;      // 5
        int i7 = str9.lastIndexOf("Java");  // 10
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
        System.out.println(i7);

        // replace & replaceFirst
        String s1 = "I like Java, Java is a programming language";
        s1 = s1.replace("Java", "C#");   // need the variable to be reassigned   REPLACE ALL OF 'EM
        System.out.println(s1);

        String s2 = "I like Java, Java is a programming language";
        s2 = s2.replaceFirst("Java", "C#");  // replace ONLY the first
        System.out.println(s2);
        String s3 = "I like Java, Java is a programming language";
        s3 = s3.replace("Java is", "C#");
        System.out.println(s3);


    }

}
