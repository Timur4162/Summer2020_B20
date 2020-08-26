package day18_For_Loop;

public class For_Loop_Practice {
    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++) {  // i: 1 = 1 print; i (i++ increase for 1) = 2 => 2 print;
                                        // i (i++ increase for 1 more ) i = 3 e t.c.
                                        // i = 5 ==> still TRUE;   i = 6 => CONDITION BECAME FALSE and NO PRINT Statement
            System.out.println("Cybertek Batch 20");
        }

        System.out.println("========================");

        for (int i=1; i<=100;i++){           // if i starts from 100;
         // initialization => condition => iterator
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("Hello");


        for (int i=100; i>=1;i--) {           // if i starts from 100;       N.B. for ITERATOR ==>  i--

            System.out.print(i + " ");
        }


    }


}
