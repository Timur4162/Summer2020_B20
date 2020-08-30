package day11_Nestedif_Ternary;
/*
precondition: min salary 30k
sub condition: min 2 years of job history
 */
public class NestedIf_Practice1 {
    public static void main(String[] args) {

        double salary = 120000;
        int jobHistory = 5;      //double

        if(salary >= 30000){
            if(jobHistory >= 2){
                System.out.println("You are prequalified");
            }else{
                System.out.println("You must have been on job at least 2 years");      // job history <2
            }



        }else{
            System.out.println("You must earn at least 30k");
        }




    }


}
