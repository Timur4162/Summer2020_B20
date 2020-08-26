package day24;

public class UniqueNumbers3 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 4, 5, 6, 7, 7, 8, 9, 9};

        for (int j = 0; j <= arr.length - 1; j++) {
            int num1 = arr[j]; // 1   j = represents every single arr
            int count = 0;

            for (int i = 0; i <= arr.length - 1; i++) {   // this LOOP ONLY CALCULATES THE FREQUENCY OF NUM
                int each = arr[i];  //   1 1 2 3 3
                if (each == num1) {
                    count++;

                }
            }

            if(count == 1){
                System.out.print(num1+" ");
            }
        }


    }
}
