package day07_Unary_ShortHand;

public class Unary {
    public static void main(String[] args) {
        System.out.println(-1+ -10);
            // -1 - 10 == -11

        System.out.println(-1 - -10);


        //--      decrease the value by 1
        int a=20;
        //a=a-1; //19
        --a;
        System.out.println(a);

        //++        increase the value by 1
        int b = 10;
        //b=b+1; //b=11;
        ++b;
        System.out.println(b);

        int x=100;
        System.out.println(++x);
        int y=200;
        System.out.println(--y);

        a++;
        b--;

        System.out.println(a--);





    }



}
