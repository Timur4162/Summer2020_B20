package day21_Loops;

public class doWhile_Practice {
    public static void main(String[] args) {
/*
        CONTINUE ===> can only be USED in LOOP   ==>  jumps to next ITERATION
        BREAK ====> can only be USED in LOOP and SWITCH ====> exits the LOOP and SWITCH
        System.exit =====> anywhere and it's terminates EVERYTHING
 */

        int num = 1;

        do{

            System.out.print(num+" ");
           num++;  // if place the ITERATOR before printStatement starts from 2

        }while (num<=20);   // if num>20 ===> prints 1

        System.out.println();
        System.out.println(num);
        System.out.println("=====================================");

        char ch = 'Z';
        do{
            System.out.print(ch+" ");
            ch--;
        }while (ch >='A');











    }

}
