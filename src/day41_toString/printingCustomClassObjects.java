package day41_toString;


public class printingCustomClassObjects {

    public static void main(String[] args) {

        String str = new String("Cybertek");

        System.out.println(str); // object name.  May print the same result WITHOUT toString. method
        System.out.println( new String("School") ); // object

        System.out.println(str.toString());
        System.out.println(new String("School").toString() );

        System.out.println("==================================================");

        Carpet c1 = new Carpet();
        c1.customOrder(5,6,19,true);



        System.out.println(c1);



    }
}
