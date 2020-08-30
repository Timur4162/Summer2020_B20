package day46_ConstructorCalls;

public class ConstructorCalls3 {

    public ConstructorCalls3() {
        System.out.println("X");
    }

    public ConstructorCalls3(int a){
        this();
        System.out.println("Y");
    }

    public ConstructorCalls3(double a){
        this();
        // this(10); // YOU CANNOT CALL 2 CONSTRUCTOR AT A TIME
    }

    public void method1(){  // INSTANCE METHOD, constructor cannot be called
       // this();
    }



}
