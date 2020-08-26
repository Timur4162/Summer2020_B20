package day05_ArithmeticOperator;

public class EmployeeInfo {
/*
  Employee' full name is: John Daniel
                        John Daniel' gender is: Male
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false
 */

    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Daniel";
        String FL = "John Daniel' ";
        char gender = 'M';
        int age = 35;
        String companyNane = "CapitalOne";
        String jobTitle = "SDET";
        boolean isFullTime = 9<10;
        boolean isMarried = 9>10;
        double salary = 120000.50;

        System.out.println("Employee' full name is: "+firstName+" "+lastName);
        System.out.println(FL + "gender is: " + gender );
        System.out.println(FL + "age is: " + age);
        System.out.println(FL + "works at: "+companyNane);
        System.out.println(FL + "job title is: "+jobTitle);
        System.out.println(FL + "salary is: " + salary);
        System.out.println(FL + "is full time employee: " + isFullTime);
        System.out.println(FL + "is married: "+isMarried);



    }




}
