package day29_Customethods;

public class UniqueElements {

    public static void main(String[] args) {
        String[] arr = {"A", "B", "B", "C" };
        uniques(arr);
        System.out.println("Hello");

        String[]arr2 = {"D","D","E","F","F"};
        uniques(arr2);


    }

    public static void uniques(String[] arr) {
        for (String a : arr) {          // gets each of the element and run it over and over

            int count = 0;              // FIRST WE NEED COUNT

            for (String each : arr) {       // gets the frequency of the element
                if (a.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {           //  if 1==count it means its unique
                System.out.print(a + " "); // prints UNIQUE
            }

        }
        System.out.println();
    }


}
