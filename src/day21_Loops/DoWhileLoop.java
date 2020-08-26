package day21_Loops;
/*
do-while loop:
    do {
        statements   - if true - EXECUTES
        } while (condition)
 */
public class DoWhileLoop {
    public static void main(String[] args) {

        boolean result = false;

        while(result){
            System.out.println("Hello World");
        }

        System.out.println("==============================");

        do{             // just DO IT and IF IT'S wrong DO NOT do it
            System.out.println("Hello world");  // WILL BE EXECUTED ONE TIME EVEN THE CONDITION IS ==> false
        }while(result);



    }
}
