package day28_Recap;

public class Frequency_of_Words {
    public static void main(String[] args) {

        String str = "javajavajavajavajavajava";
        //            01234567

        // substring ( 0, 4) ===> java
        // substring ( 1, 5) ===> avaj
        // substring ( 2, 6) ===> vaja
        // substring ( 3, 7) ===> ajav
        // substring ( 4, 8) ===> java

        // substring (i, i+4)

        // "java"

        int count = 0;
        for (int i = 0; i<= str.length()-4;i++) { // i:0, 1, 2, 3, 4, 5, 6, 7

            String s = str.substring(i, i + 4);
            if (s.equalsIgnoreCase("java")) {
                count++;
            }

        }
            System.out.println(count);





    }
}
