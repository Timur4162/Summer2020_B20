package day14_Recap;
import java.util.Scanner;
/*
write a program for the shipping info that, the program should ask:
                    building number
                    Street address (Assume it has more than one word)
                    city name
                    state name
                    zip code
                    full name of the person:
            and prints the ship to info in the following format:
            ex output:
                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102

 */
public class address {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter building number: ");
        int buildingNumber = input.nextInt();
        input.nextLine();
        System.out.println("Enter street address: ");
        String streetAddress = input.nextLine();
        System.out.println("Enter city name: ");
        String cityName = input.nextLine();
        System.out.println("Enter state: ");
        String stateName = input.nextLine();
        System.out.println("Enter zip code: ");
        int zipCode = input.nextInt();
        input.nextLine();
        System.out.println("Enter full name: ");
        String fullName = input.nextLine();

        System.out.println("Ship to: "+ fullName);
        System.out.println("         "+ buildingNumber+" "+streetAddress);
        System.out.println("         "+ cityName+" "+stateName+" "+zipCode);

    }
}
