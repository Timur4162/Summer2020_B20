package QUIZ;

public class quiz {
    public static void main(String[] args) {
        int i = 0;
        int j = 7;

        for (i=0;i<j-1;i+=2) {
            System.out.println(i+"");
            /*
            answers:
                    1) fails
                    2) 0 2 4 6
                    3) 2 4
                    4) 0 2 4 ==== CORRECT

             */


            int a = 0;
            while (a<=6){
                a+=2;
            }
            System.out.println(a);
            /*
            answers:
                1) 4
                2) 10
                3) 8 ==== CORRECT
                4) 6
             */
        }

    }
}
