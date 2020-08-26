package QUIZ;

import java.util.Arrays;

public class quiz6 {
    public static void main(String[] args) {

        int count = 0;
        for (int a= 0;a<4;a++){
            if (a == 3)continue;
            for (int b = a+1;b<5;b++){
                count++;
                if (b==3)break;
            }
        }
        System.out.println(count);

        //======

        int[] nums = new int [5];
        int a = 5;

        nums[2] = a--;
        nums[0] = a*2;
        nums[4] = --a + (a-9);
        nums[1] = nums[2];
        nums[3] = nums[a-3];
        System.out.print(Arrays.toString(nums));

        System.out.println();


        double[] doub = new double[4];
        doub[0] = 1.0;
        doub[2] = 42.1;
        doub  = new double[4];
        doub [1]= 17.2;
        doub[3] = doub.length;
        System.out.println(Arrays.toString(doub));
        System.out.println();

        //==========
        String[]strs = {"display","population","meeting","copy","franchise"};

        int a1 = strs.length;
        int b = strs[5].length();

        System.out.print(a1 + " "+ b);



    }
}
