package day07_Unary_ShortHand;

public class Quiz {

    public static void main(String[] args) {

        int iNum = 100;
        double dNum = 200;
        float fNum = 300;

        //iNum = fNum;
        fNum = iNum;
        dNum = fNum;
        fNum = (float)dNum;  // line 7, error without casting


        System.out.println("Result A" + 0 + 1);
        //                  "Result A01"
        System.out.println("Result B" + (1) + (2));
        //                  "Result B12"

        long a = 3_000L;
        double b = (float)a;
        int c = (short)b;
        System.out.println(c%1000);
        System.out.println(10.0/3);



    }
}
