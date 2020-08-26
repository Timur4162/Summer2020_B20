package day08_Logical_Operators;

public class if_Statements {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;


        if ( a > b ) {
            System.out.println(a+ " is the larger number");
        }

        if ( b > a ) {
            System.out.println(b+ " is the max number");
        }

        if ( a == b) {
            System.out.println("Both are equal");
        }

        System.out.println("=====================================");

        boolean BreakTime = true;

        if(BreakTime==true){
            System.out.println("Take 15 minutes break!");
        }

        if(BreakTime==false){
            System.out.println("Keep studing");
        }

        boolean Corona=true;
        if(Corona==true){
            System.out.println("Buy more toilet paper");
            System.out.println("Buy more hand sanitizers");
            System.out.println("Social distancing");
            System.out.println("Stay at home");
        }




    }


}
