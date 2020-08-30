package day47_Encapsulations;

public class Constructor {

    static {
        System.out.println("static block");
    }

    public Constructor(int a) {
        // this() <= cannot be used
        System.out.println("int arg");//   prints "int arg"
    }

    public Constructor(double a) {
        this(10); // prints "int arg"   ==== cos int arg in the printices
        System.out.println("double arg");//  then prints "double arg"

    }

    public Constructor(String a) {
        this(10.0); // prints "double arg"
        System.out.println("String arg"); // then "String arg"
    }

    public static void main(String[] args) {
        // new Constructor(); = gives error without PARAMETER

        new Constructor(4);
        new Constructor(3.9);
        new Constructor("Arg");


    }
}
