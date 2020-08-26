package day29_Customethods;

public class MethodsWithoutParameter2 {

    /*
    Access-Modifier Specifiers return-type name90{
    }

step1: print hello 5 times
step2: print your school name === outside the loop if 1 time
step3: print hello 5 times
step4: print your name
step5: print hello 5 times
     */
    public static void main(String[] args) {
        printHello5X();
        System.out.println("Cybertek");
        printHello5X();
        System.out.println("Tim");
        printHello5X();

    }

    public static void printHello5X() {

        for (int i = 10; i >= 6; i--) {
            System.out.println("Hello");
        }


    }

}
