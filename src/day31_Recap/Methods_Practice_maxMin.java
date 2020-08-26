package day31_Recap;

public class Methods_Practice_maxMin {
    public static void main(String[] args) {
        max(12,13);
        int b = max2(11,22);
        System.out.println(max2(11,22));
        System.out.println(max2(11,22)*3);
    }

    public static void max(int a, int b) {  // will displayed automatically
        int max = a > b ? a : b;
        System.out.println(max);

    }

    public static int max2(int a, int b){

        return (a > b) ? a : b;

    }

}
