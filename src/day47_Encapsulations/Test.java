package day47_Encapsulations;

public class Test {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable); // public is accessible ar everywhere
        AccessModifiers.publicMethod();

        System.out.println(AccessModifiers.defaultVariable );//
        AccessModifiers.defaultMethod();


        //System.out.println( AccessModifiers.privateVariable );

        Encapsulation obj1 = new Encapsulation();
        //System.out.println(obj1.getssn);
        System.out.println(obj1.getSsn());



    }


}
