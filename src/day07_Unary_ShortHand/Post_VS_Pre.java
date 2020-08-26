package day07_Unary_ShortHand;

public class Post_VS_Pre {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a); //11    increases the value by 1 immedietly
        System.out.println(a);//11

        int b = 10;
        System.out.println(b++);//10
        System.out.println(b++);//11      increases the value by 1 the next step of operation
        System.out.println(b++);//12
        System.out.println(b);//13


        int c = 25;
        int d = c++;
        System.out.println(c);
        System.out.println(d);

        int A = 1;
        A = -A-- + A++ / -A-- * --A;
     // A=  -1   +0    / -1   * -1
        //A = -1 + 0 * -1
        //A = -1 + 0= -1
        System.out.println(A);


        int r = 50;
        r= --r + r++ + r -- + r++;
        //  49 + 49 + 50 + 49
        // 197
        System.out.println(r);





    }


}
