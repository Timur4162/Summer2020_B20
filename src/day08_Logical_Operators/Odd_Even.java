package day08_Logical_Operators;

public class Odd_Even {
    public static void main(String[] args) {
        int number = 120;

        boolean even = number % 2 ==0;
        boolean odd = !even;

        if(even){
            System.out.println(number+" is even number");
        }
        if(odd){
            System.out.println(number+" is odd number");
        }
    }

}
