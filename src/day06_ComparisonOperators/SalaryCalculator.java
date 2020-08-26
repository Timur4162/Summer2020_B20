package day06_ComparisonOperators;

public class SalaryCalculator {

    public static void main(String[] args) {
        double rate = 50.0;
        double stateTaxRate = 0.05;
        double federalTaxRate = 0.2;
        int weeklyHours = 45;



        double salary = rate * weeklyHours * 48;
        double totalTax = salary * (stateTaxRate+federalTaxRate);
        double afterTax = salary - totalTax;

        System.out.println("Salary before tax: "+salary + " USD");
        System.out.println("Total tax: " + totalTax + " USD");
        System.out.println("Salary after tax: "+ afterTax + " USD");


    }




}
