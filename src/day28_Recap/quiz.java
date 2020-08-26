package day28_Recap;

import java.util.Arrays;
// result of this statement
public class quiz {
    public static void main(String[] args) {

        char[]array = {'D','C','A','B'};
        Arrays.sort(array);

        for (char each : array){
            System.out.print(each+" ");
            if (each =='D'){
                continue;
            }
        }

    }
}
