package day32_MethodOverloading;

import Library.Util;

import java.util.Arrays;

public class MethodsCalls {

    public static void main(String[] args) {

        String firstName = "elKEm";
        String lastName = "emEt";

        String fullName;

        fullName = Util.formatFullName(firstName, lastName);

        System.out.println(fullName);

        String uniques = Util.uniques(fullName.toLowerCase());

        System.out.println(uniques);


        String reversedName = Util.reverse(fullName.toLowerCase());

        System.out.println(reversedName);

        System.out.println("==========================================");

        int[] a = {200, 300, 400, 3000, 23123, 900, 50, 60};
        int n = 2500;

        a = Util.addElement(a, n);
        System.out.println(Arrays.toString(a));


    }
}
