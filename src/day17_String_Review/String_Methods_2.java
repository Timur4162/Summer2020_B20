package day17_String_Review;

public class String_Methods_2 {
    public static void main(String[] args) {

        // equal  ====> compare the text itself
        String s1 = "Cat";      // String POOL
        String s2 = new String("Cat");// HEAP
        String s3 = new String("Cat");

        System.out.println(s1 == s2);         // false
        System.out.println(s1.equals(s2));  // true

        System.out.println(s2 == s3);         // false
        System.out.println(s2.equals(s3));  // true


        // equalsIgnoreCase  ===> ignore case sensitivity
        String s4 = "java";
        String s5 = "Java";
        System.out.println(s4 == s5);         // false
        System.out.println(s4.equalsIgnoreCase(s5));  // true

        String s6 = "TiMuR";
        String s7 = "Timur";
        System.out.println(s6.equalsIgnoreCase(s7));  // true


        //isEmpty ===> checks the length is 0 or not / gives TRUE or FALSE
        String str = "    ";  // 4 spaces
        System.out.println(str.isEmpty()); // false;
        str = str.trim();//""
        System.out.println(str.isEmpty());  // true   ==> but without reassigning to variable str, gives FALSE

        String str2 = "Cybertek";  // length !=0
        System.out.println(str2.isEmpty()); //====> false

        str2 = "";
        System.out.println(str2.isEmpty()); // true


        // contains:   ==> going to check the text contains a STRING or not
        String str3 = "Java, C#, Python, C++";
        System.out.println(str3.contains("Java"));  // true
        System.out.println(str3.contains("java"));  // false

        // System.out.println(str3.toLowerCase().contains("java"));    //true

        String str4 = "ABCd"; // == D
        System.out.println(str4.contains("D"));




        // startsWith
        String str5 = "Cybertek";
        System.out.println(str5.startsWith("C"));   // true
        System.out.println(str5.startsWith("Cyber"));   // true
        System.out.println(str5.startsWith("Cyberabs"));   //  false
        System.out.println(str5.startsWith("E")||str5.startsWith("C"));  // true      OR logic


        //endsWith     ======> looks ENDing word
        String str6 = "corona";
        System.out.println(str6.endsWith("Virus"));   // false

        String str7 = "today is a great day";
        System.out.println(str7.endsWith("day")); // true



    }

}
