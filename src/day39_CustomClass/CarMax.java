package day39_CustomClass;

public class CarMax {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();


        car1.setCarInfo("Lexus", "RX350", 2019, "White", 14000, 45000);
        car2.setCarInfo("Lexus", "RX450", 2020, "Black",2000, 50000 );
        car3.setCarInfo("Buggati", "Vyeron", 2018, "Blue", 23000, 500000);
        car4.setCarInfo("Dodge", "Challenger", 2017, "Green", 30000, 16000);
        car5.setCarInfo("Ford", "Bronco", 1989, "Silver", 34000, 9000);

        car1.getCarInfo();
        car2.getCarInfo();
        car3.getCarInfo();
        car4.getCarInfo();
        car5.getCarInfo();

        car3.start();

    }
}
