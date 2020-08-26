package replit;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_FrontPiece_139 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];

        for (int i = 0; i < size;i++) {
            num[i] = scan.nextInt();
            if (size < 2) {
                System.out.println(Arrays.toString(num));
            } else {
                System.out.println("" + "[" + num[0] + ", " + num[1] + "]");
                break;

            }
        }


     //   System.out.println(Arrays.toString(num[0][1]));
    }
}
