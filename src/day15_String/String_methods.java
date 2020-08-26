package day15_String;

public class String_methods {
    public static void main(String[] args) {

        String name = "Cybertek School is a great place";
        //             01234567

        // charAt(index):
        char ch1 = name.charAt(0); //'C'
        char ch2 = name.charAt(5); //'t'
        System.out.println(ch1);
        System.out.println(ch2);

        // length() ==> int
        int l =   name.length();
        System.out.println(l);

        // last index: length of String - 1
        int lastIndexNumber = name.length() - 1;

        System.out.println( lastIndexNumber );

        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);

        // concat (String)
        String schoolName = "Cybertek";
          schoolName = schoolName.concat(" School");  // Cybertek School

        System.out.println(schoolName);

        String r1 = "Cybertek"+123+'a'+true;
        System.out.println(r1);

        String r2 = "Cybertek".concat("123");

        System.out.println("=====================================");

        // to LOWER case
        String name1 = "CYBERTEK SCHOOL";
        name1 = name1.toLowerCase();

        System.out.println(name1);

        // to UPPER case
        String name2 = "cybertek school";
        name2 = name2.toUpperCase();
        System.out.println(name2);

       //String name4= (TOLOWERCASE).toLowerCase;

        System.out.println("=====================");







    }
}
