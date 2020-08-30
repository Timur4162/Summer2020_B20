package day46_ConstructorCalls;

public class CarObjects {

    public static void main(String[] args) {

        System.out.println( new Car("Toyota", "Camry", "White", 2002,3000));
        System.out.println("=======================================");
        System.out.println( new Car("Lexus", "RX350", "Silver"));
        System.out.println("=======================================");
        System.out.println( new Car("Tesla"));
        System.out.println("=======================================");
        System.out.println( new Car("BMW", "X3"));

    }
}
