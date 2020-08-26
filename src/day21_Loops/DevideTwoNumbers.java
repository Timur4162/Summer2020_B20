package day21_Loops;

/*   =========================  INTERVIEW QUESTION  =======================
3. write a program that can divide two numbers without using / & % operators and retuns the devision and remainder
            ex:
                input:  10
                        3
                0utput: 3 with a remainder of 1

                10 - 3 = 7
                7 - 3 = 4
                4 - 3 = 1

                3 - 3 = 0
 */
public class DevideTwoNumbers {
    public static void main(String[] args) {

        int a = 20;
        int b = 0;


        if (b == 0){
            System.out.println("Invalid Input");
            System.exit(0);     // forcefully TERMINATING THE PROGRAMM
        }
        int count = 0;   // 3

        while (a >= b) {
            a -= b;     // a = a - b
            count++;
        }

        System.out.println(count+ " with a remainder of "+a);
    }

}
