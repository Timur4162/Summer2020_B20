package day20_WhileLoops;

import java.util.concurrent.locks.Condition;

public class whileLoop_Practice {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {   // 1) initialization 2) condition  3) iteration
            System.out.print(i + " ");
        }

        System.out.println();

        int num = 1;            // CONVENIENT WHEN USING WITHOUT INITIALIZATION
        while (num<=10){        // condition

            System.out.print(num+" ");
            num++;   // <== iterator    MUST BE AFTER THE PRINT STATEMENTS

        }

    }

}
