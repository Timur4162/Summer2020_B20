package day11_Nestedif_Ternary;

public class Ternary_Practice1 {
    public static void main(String[] args) {
        int age = 14;
        String citizen = "USA";

        String result = "";


        if(age>=18 && citizen == "USA"){
            result = "Can vote";
        }else{
            result = "can not Vote";
        }
        System.out.println(result);


        String result2 = (age>=18 && citizen == "USA") ? "Can vote":"can not Vote";
        System.out.println(result2);


        System.out.println("=======================================================");
        int n1 = 100;
        int n2 = 200;

        String r = (n1 == n2)?"Equal":"Not equal";
        System.out.println(r);

        System.out.println("====================================");




    }
}
