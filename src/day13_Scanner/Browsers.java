package day13_Scanner;

public class Browsers {
    public static void main(String[] args) {
        String browserName = "firefox"; // boolean long double float are not excepted in SWITCH

        switch (browserName){                   // SWITCH should match with the CASE exp. SWITCH String = case String
            case "chrome":
                System.out.println("Opening Chrome browser");
                break;

            case "firefox":
                System.out.println("Opening Firefox browser");
                break;

            case "safari":
                System.out.println("Opening safari browser");
                break;

            case "opera":
                System.out.println("Opening Opera browser");
                break;

            case "edge":
                System.out.println("Opening Edge browser");
                break;

            default:
                System.out.println("Invalid Browser Name");


        }





    }

}
