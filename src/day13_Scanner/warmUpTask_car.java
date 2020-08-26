package day13_Scanner;

import java.util.Scanner;

public class warmUpTask_car {
    public static void main(String[] args) {
       /* 1. write a program that asks the user enter his car info:
        brand
                model
        year
                color
        mileage
                price
        ex: output format should be:
        2012 Toyota Corolla white, 120000 miles, 12000 dollars

        */
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your car brand: ");
        String brandName=scan.next();

        System.out.println("Enter your model name: ");
        String modelName = scan.next();

        System.out.println("Enter year of the car: ");
        String yearOfCar = scan.next();

        System.out.println("Enter color of the car: ");
        String color = scan.next();

        System.out.println("Enter mileage of the car: ");
        String mileage = scan.next();

        System.out.println("Enter price of the car: ");
        String price = scan.next();

        String details = yearOfCar+" "+brandName +" "+modelName+" "+color+", "+mileage+" miles"+", "+price+" dollars";
        System.out.println(details);


        scan.close();






    }

}
