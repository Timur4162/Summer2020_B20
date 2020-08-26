package replit;

import java.util.*;

public class Arrays_findNonDup_122 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO: write your code below
        for (int j = 0; j <= nums.length - 1; j++) {
            int num1 = nums[j];
            int count = 0;
            for (int k = 0; k <= nums.length - 1; k++) {
                int each = nums[j];
                if (each == num1) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(num1);
            }
        }


    }
}



