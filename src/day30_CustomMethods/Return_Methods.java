package day30_CustomMethods;

public class Return_Methods {
    public static void main(String[] args) {
        additon1(3, 4); // it is not reusable and we cannot assign to variable
        int sum = addition2(3, 4);
        System.out.println(sum);
        System.out.println(addition2(3,4)*2);

    }

    public static void additon1(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static int addition2(int a, int b) {
        int sum = a + b;
        return sum;


    }


}
