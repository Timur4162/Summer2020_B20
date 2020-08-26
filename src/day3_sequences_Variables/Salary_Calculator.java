package day3_sequences_Variables;

public class Salary_Calculator {

    public static void main(String[] args) {

        /*
        totalTax = salary * tax;
        salaryAfterTheTax = salary - totalTax
         */

        double salary = 150000.0;
        double tax = 0.28;
        double totalTax = salary*tax;
        double salaryAfterTax = salary-totalTax;


        System.out.println(salary*tax);
        System.out.println(salary-totalTax);






    }



}
