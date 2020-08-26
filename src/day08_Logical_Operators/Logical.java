package day08_Logical_Operators;

public class Logical {
    public static void main(String[] args) {
        //!: opposite boolean
        boolean r1 = 9>7; // true

        boolean r3 =!false == true;
        // true == true ==> true
        System.out.println(r3);

        boolean r4 = true == !true; // false
        System.out.println(r4);

        boolean r5 = 9 > 5 && 9 > 10;
        //          true && false

        boolean r6 = !true && false;







    }


}
