package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        Employee employee1 = new Employee(); //  CUSTOM CLASS  = or OBJECT
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();
        Employee employee6 = new Employee();

        employee1.setEmployeeInfo("Daneil Craig", 'M', 123123123, "teller",40000);
        employee2.setEmployeeInfo("Roman Deshevyh", 'M', 987654321, "driver", 45000);
        employee3.setEmployeeInfo("Ivan Durakov", 'F', 555444333, "cleaner", 30000);
        employee4.setEmployeeInfo("Monica Belluchi", 'F', 999999999, "Manager", 60000);
        employee5.setEmployeeInfo("Warren Buffet", 'M', 444433321, "riskManger", 78000);
        employee6.setEmployeeInfo("Michael Jordan Jr", 'M', 123443215,"Business Analyst",99000);

        employee1.getEmployeeInfo();
        System.out.println();
        employee2.getEmployeeInfo();
        System.out.println();
        employee3.getEmployeeInfo();
        System.out.println();
        employee4.getEmployeeInfo();
        System.out.println();
        employee5.getEmployeeInfo();
        System.out.println();

        ArrayList<Employee>employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6));

        double max = Integer.MIN_VALUE;
        String name = "";
        for (Employee each : employeeList) {
             double eachSalary = each.salary; // eachEmployee.getEmployeeInfo();
            if (eachSalary > max){
                max = eachSalary;
                name = each.name;
            }
        }
        System.out.println("Maximum salary: " + max);
        System.out.println("Employees name: " + name);
        System.out.println();
        System.out.println("======================================");

       // employeeList.removeIf(p ->p.salary < 50000);  // to remove the employee who makes less then 50000
        employeeList.removeIf(each -> each.salary > 30000);
        employeeList.removeIf(each -> each.name.toLowerCase().contains("m"));
        


        for (Employee each : employeeList){
            // each.getEmployeeInfo();
            System.out.println(each.name+" : "+each.salary);
        }

    }
}
