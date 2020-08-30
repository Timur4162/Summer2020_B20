package day46_ConstructorCalls;

public class ConstructorCalls2 {

    public ConstructorCalls2(){

        System.out.println("A");
    }

    public ConstructorCalls2(int a){
        //ConstructorCalls2();

        this();//   Calling default constructor. To call CONSTRUCTOR in the another CONSTRUCTOR
        // this. - for calling INSTANCE VARIABLE and METHODS
        System.out.println("B");
    }

    public ConstructorCalls2(String a){
        this(4); // A B  - first prints A , B
        System.out.println("C"); // then prints - C

    }

    public ConstructorCalls2(char a){
        this(); // NEEDS TO BE AT THE FIRST STEP
        System.out.println("D");
    }

    public ConstructorCalls2(double a){
        this(10);
        System.out.println("E");

    }


    public static void main(String[] args) {

       new ConstructorCalls2('A');
    }




}
