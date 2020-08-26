package day25;

public class count_Odd_Even {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int countEven = 0;
        int countOdd = 0;

        String even = "";
        String odd = "";

        for (int each : nums){

            if (each %2 ==0){
                countEven += 1;
                even += each + " ";   // needs to print the numbers itself
                continue;
            }
            countOdd++;
            odd += each + " ";
        }

/* ====================Second VARIANT =====================
        for (int each : nums) {
            if (each % 2 == 0){
                countEven += 1;
            }else{
                countOdd++;
            }
        }
*/
        System.out.println("Even numbers: " + countEven);
        System.out.println(even);
        System.out.println("Odd numbers: " + countOdd);
        System.out.println(odd);
    }
}
