package day34_WrapperClasses;

public class WrapperClassMethods {

    //  MOSTLY will use -   Integer     Double      Character      Boolean

    public static void main(String[] args) {

        String str = "123";             // expected  - 123  (int)
        int a = Integer.parseInt(str);  // parse methods return the primitive at the end

        System.out.println(a + 1);      //124 number   to check needs addition
        System.out.println(str + 1);    //1231 String      gives concatenation

        Double d = Double.parseDouble("7.5");   // convert a String to other primitives
        System.out.println(d + 2);

        String s1 = "true";

        boolean b1 = Boolean.parseBoolean(s1);  // ignore key sensitivity
        System.out.println(!b1);  // ! gives false - just to check the boolean

        System.out.println("==================================");


        /*
        parse methods: converts string of text to primitive value
                        not case sensitive
        valueOf methods: converts string of text to wrapper class value
                    not case sensitive
        */

        String s2 = "10000.5";
        double d2 = Double.valueOf(s2);  //  unboxing
        System.out.println(d2 + 1);

        String s3 = "FaLSe"; // assign to a boolean
        boolean r2 = Boolean.valueOf(s3);    // unboxing

        System.out.println(r2);

    }

}
