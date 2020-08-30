package Library;

import day47_Encapsulations.AccessModifiers;

public class Test_AccessModifiers {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();

       // System.out.println( AccessModifiers.defaultVariable); // default is not accessible outside the package
        // AccessModifier.defualMethod();

        //System.out.println(AccessModifiers.privateVariable); private is not visible outside its class
        //AccessModifiers.privateMethod();


    }
}
