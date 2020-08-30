package day46_ConstructorCalls;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeesObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Marat","Teller", 12314,78000);
        Employee employee2 = new Employee("Alice", "manager", 888993);

        Employee employee3 = new Employee("Cristina");

        System.out.println(employee1);
        System.out.println("=====================");
        System.out.println(employee2);
        System.out.println("=====================");
        System.out.println(employee3);
        System.out.println("=====================");

        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>(list1);
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5) );
        System.out.println(list3);
    }
}
