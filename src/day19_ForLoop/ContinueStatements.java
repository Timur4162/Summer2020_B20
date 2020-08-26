package day19_ForLoop;

public class ContinueStatements {
    public static void main(String[] args) {

        for (int i = 1; i<= 5; i++){    //i: 1,2,3,4,5,     works only in the loops

            if (i==3){
                continue;       // when i==3 ==> jumps to  the next iteration
            }

            System.out.print(i+" ");  // 1  2  4  5

        }

        System.out.println("=============================");

        for (char ch = 'A'; ch <= 'F'; ch++){       // A B C D E F

            if (ch == 'C' || ch == 'F') {
                continue;
            }

            System.out.print(ch + " ");


        }
        System.out.println();


    }
}
