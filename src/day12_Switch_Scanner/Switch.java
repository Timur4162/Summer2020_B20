package day12_Switch_Scanner;

public class Switch {
    public static void main(String[] args) {

        int a = 5;

        switch (a){

            case 5:
                System.out.println("five");
                break;                          // <==  when NO break - continue to execute the next case/code

            case 1:
                System.out.println("one");
                break;

            default:
                System.out.println("Invalid case");
                break;


        }


    }

}
