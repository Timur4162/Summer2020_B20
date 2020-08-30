package Office_Hours.Practice_08_26;

public class Practice2 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        printArray(arr1);  // CALLING THE METHOD

        int[] arr2 = {9, 8, 7, 6, 5, 4};
        printArray(arr2);

        int[] arr3 = {100, 200, 300};
        printArray(arr3);

        String[] arr4 = {"Muha","Cakatuha","Dima","Lesha"};
        printArray(arr4);

        char[] arr5 = {'B','E','F','R','L'};
        printArray(arr5);

        double[] arr6 = {11.2,55.4,66.4,22.5,457.5};
        printArray(arr6);
    }

// everything which = STATIC = belongs to the class, will be able to called through the class
    //wants to print the result ONLY

    public static void printArray(int[] arr) {
        for (int each : arr) {
            System.out.print(each + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] arr) {
        for (String each : arr) {
            System.out.print(each + " ");
        }
        System.out.println();
    }
    public static void printArray(char[] arr) {
        for (char each : arr) {
            System.out.print(each + " ");
        }
        System.out.println();
    }
    public static void printArray(double[] arr) {
        for (double each : arr) {
            System.out.print(each + " ");
        }
        System.out.println();
    }
}
