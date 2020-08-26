package day42_Static;

public class Car {
        // INSTANCE
    String brand;
    String model;
    int year;
    String VIN;
    String color;
    double price;

        // STATIC
    static boolean hasWheel = true;
    static int numOfTires = 4;
    static boolean hasEngine = true;
    static boolean hasDoors = true;
    static boolean hasAirBag = true;
    static boolean hasSeatBelt = true;
    static boolean hasHorn = true;


    public void start() {  //  <=  INSTANCE METHOD
        System.out.println("Starting " + brand + " " + model);
    }

    public static void printTires() {
        System.out.println(numOfTires + " tires");
    }

    public String toString(){
        return "Brand: "+brand+", Model: " +model + ", Year: "+ year +", Color: "+color
                +"\nNumbers of tires: "+ numOfTires+"\nHas Engine: " + hasEngine
                + "\nHas Wheel: "+ hasWheel+"\nHas Airbags: "+hasAirBag;
    }





    /*
    car1;
    car2;
    car3;
    car4;
     */


}
