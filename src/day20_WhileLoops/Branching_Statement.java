package day20_WhileLoops;

public class Branching_Statement {

    public static void main(String[] args) {

        char ch = 'A';
        while (ch <= 'E') {

            if (ch == 'C') {
                ch++;
              continue;           //  SKIPS EVERYTHING, EVEN THE ITERATOR   ===> after the print statement
                // break;   ===> EXITS THE LOOP
            }
            System.out.print(ch + " ");
            ch++;   // skips ONE ITERATOR   ===> MEANS the 'C' character

            if (true){
                System.exit(0);   //    <====    STOPS JAVA WORKING MACHINE  ===> TERMINATE THE ENTIRE SYSTEM
            }
            System.out.println("DONE");
        }


    }


}
