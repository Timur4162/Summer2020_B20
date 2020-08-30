package day09_IfStatement;

public class Alcohol {

    // 4. write a java program that can identify if a person is eligible to buy alcohol

    public static void main(String[] args) {

        boolean hasID = true;
        int age = 20;

        String result = "";

        boolean eligible = hasID && age >= 21;
        //                  true &&  false

        if(eligible == true){
            //System.out.println("Eligible to buy alcohol");
            result = "Eligible to buy alcohol";
        }
        if(eligible == false){
            //System.out.println("Go buy your milk");
            result = "You are not old enough to buy alcohol";
        }
        System.out.println(result);

    }
}
