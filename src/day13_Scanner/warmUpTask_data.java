package day13_Scanner;

import java.util.Scanner;

/*
    write a program that asks the user to enter:
                        1. building number
                        2. street name (assume it has one word only)
                        3. road name (assume it has one word only)
                        4. city name (assume it has one word only)
                        5. state
                        6. zipcode
            and then print out the full address
                ex:
                    input:
                            7925
                            JonesBranch
                            Dr
                            McLean
                            VA
                            22000
                    output:
                        addrees:    7925 JonesBranch Dr, McLean VA, 22000
Collaps
     */
public class warmUpTask_data {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your building number: ");
        int buildingNumber = scan.nextInt();

        System.out.println("Enter your street name: ");
        String streetName = scan.next();

        System.out.println("Enter your name road: ");
        String nameRoad = scan.next();
        System.out.println("Enter your city: ");
        String city = scan.next();
        System.out.println("Enter your state: ");
        String state = scan.next();
        System.out.println("Enter your zip code: ");
        int zip = scan.nextInt();

        String full = "address: " + buildingNumber + " " + streetName + " " + nameRoad + ", " + city + " " + state + ", " + zip;
        System.out.println(full);


    }


}
