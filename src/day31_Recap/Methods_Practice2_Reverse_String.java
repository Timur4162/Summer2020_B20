package day31_Recap;
/*
1. create a method that can reverse a string
2. identify if a string is palindrome

 */
public class Methods_Practice2_Reverse_String {
    public static void main(String[] args) {
        String name = "madam";

        String rev = reverse2(name);
       // System.out.println(name.equalsIgnoreCase(reverse1(name);));   ERROR
        System.out.println(reverse2("madam"));
        System.out.println(name.equalsIgnoreCase(reverse2(name)));
    }


    public static void reverse1(String str){
        String expectedResult = "";
        for (int i = str.length()-1;i>=0;i--){
            expectedResult += str.charAt(i);
        }
        System.out.println(expectedResult);
    }

    public static String reverse2(String str){
        String expectedResult = "";
        for (int i = str.length()-1;i>=0;i--){
            expectedResult += str.charAt(i);
        }
        return expectedResult;
    }
}
