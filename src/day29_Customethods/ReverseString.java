package day29_Customethods;

public class ReverseString {
    public static void main(String[] args) {

        reverse("Timur");

    }


    public static void reverse(String str) {
        String result = "";    // reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        System.out.println(result);

    }


}
