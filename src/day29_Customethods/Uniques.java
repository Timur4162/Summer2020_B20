package day29_Customethods;

public class Uniques {

    public static void main(String[] args) {

        String[] arr = {"A", "B", "B", "C", "D", "E", "F" };
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

    }
}


