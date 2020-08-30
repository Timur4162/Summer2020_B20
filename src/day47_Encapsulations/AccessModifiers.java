package day47_Encapsulations;

public class AccessModifiers {

    public static int publicVariable = 100;

    public static void publicMethod(){
        System.out.println("public method");
    }

    // default  == visible only in the same package
    static int defaultVariable = 200;

    static void defaultMethod(){
        System.out.println("default method");
    }

    // private
    private static int privateVariable = 300; // without static verify could be an error in main method

    private static void privateMethod(){
        System.out.println("private variable");
    }

    public static void main(String[] args) {
        System.out.println(publicVariable);
        System.out.println(defaultVariable);
        System.out.println(privateVariable); // can be called cos in the same class

        publicMethod();
        defaultMethod();
        privateMethod();
    }

}
