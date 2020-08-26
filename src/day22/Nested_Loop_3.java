package day22;

public class Nested_Loop_3 {
    public static void main(String[] args) {

        int j = 1;

        while (j <= 4) {

            for (int i = 1; i <= 5; i++) {
                System.out.print("*");
            }
            j++;
            System.out.println();
        }

    }

}
