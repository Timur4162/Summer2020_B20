package day46_ConstructorCalls;

public class ConstructorCalls {

    public ConstructorCalls(){
        method1();
        method2();
        method3();
    }

    public static void method1(){
        method2();
       // ConstructorCalls();
    }

    public static void method2(){
        method1();
    }

    public void method3(){ //  INSTANCE METHOD
       // ConstructorCalls();
       // this() ; - COMPILER ERROR
    }

}
