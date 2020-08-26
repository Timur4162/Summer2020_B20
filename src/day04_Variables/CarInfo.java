package day04_Variables;

import javax.swing.*;

public class CarInfo {

    public static void main(String[] args) {
     /*
        ask:
        create a class called CarInfo:
        Year
                Brand
        Model
                Mileage
        Price
        print the info of the car
        Ex:
        2020
        BMW
                X5
        30000
        45000
        output:
        2020 BMW X5, 3000 miles, $45000
*/
        int year = 2020;
        String brand = "BMW";
        String model = "X5";
        short miles = 30000;
        double price = 45000;

        System.out.println(year + " " +brand+" "+model+", "+miles+", "+'$'+price);
        System.out.println(year+" "+brand+" "+model+", "+miles+" miles, $"+price);// correct one


    }






}
