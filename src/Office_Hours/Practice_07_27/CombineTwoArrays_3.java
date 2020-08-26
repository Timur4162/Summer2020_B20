package Office_Hours.Practice_07_27;

import java.util.Arrays;

public class CombineTwoArrays_3 {
    public static void main(String[] args) {

        String[] a1 = {"Tatyana", "Hamit", "Phosri"};   // i : 0, 1, 2
        String[] a2 = {"Aloe", "Zaki", "Cristina", "Dawut"};

        String[] students = new String[a1.length + a2.length];  // combination of two arrays

        for (int i = 0; i <= a1.length - 1; i++) {
            students[i] =  a1[i];
        }

        for (int i = 0; i <= a2.length -1; i++) {
            students[i+a1.length] = a2[i];              //  the LENGTH of the first Array a1
        }


        System.out.println(Arrays.toString(students));

    }
}
