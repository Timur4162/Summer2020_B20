package day17_String_Review;

public class Pool_VS_Heap {
    public static void main(String[] args) {

        String s1 = "Cybertek";         // located in STRING POOL
        String s2 = "Cybertek";         // String POOL

        String s3 = new String("Cybertek"); // HEAP
        String s4 = new String("Cybertek"); // HEAP
        String s5 = "cybertek";         // String pool


        System.out.println(s1 == s2);   // true
        System.out.println(s1 == s3);   // false
        System.out.println(s3 == s4);   // false
        System.out.println(s5 == s1);   // false


    }

}
