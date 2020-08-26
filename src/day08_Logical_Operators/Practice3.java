package day08_Logical_Operators;

public class Practice3 {

    public static void main(String[] args) {
        int b = 2;
        boolean res = ++b ==2 || --b == 2 && --b == 2;
        //             3  ==2 or 2  == 2  && 1 ==2
        //               false  ||  true     && false
        //                       true  && false
        //   ++b = increase immed  3==2 = false

        System.out.println(res);


        int c = 5; // c =6
        boolean r2 = c++ == 6 || c-- == 5 || c == 5;
        //      r2 =  5 == 6  ||  6 == 5  || 5 == 6
        //      r2 = false    || false    || true

        System.out.println(r2);

        boolean A = true;
        boolean B = !A;

        boolean C = A!= B && A == !B    && !A == B;
        //  true! = false  && true==true && false=false
        //        true     && true       && true

        System.out.println(C);




    }



}
