package day41_toString;

class TesterObjects{
    public static void main(String[] args) {
        Tester[]testers = {new Tester(),new Tester(),new Tester(),new Tester(),new Tester()};
        testers[0].setInfo("Alia", 150000, "Female", 19);
        testers[1].setInfo("Naz",120000,"Female", 22);
        testers[2].setInfo("Kalbinur", 123000,"Female", 33);
        testers[3].setInfo("Rakhat",134000,"Female", 35);
        testers[4].setInfo("Edward", 190000,"Male", 34);

        for (Tester each : testers){
            System.out.println(each);
        }


    }

}


public class Tester {

    String name;
    double salary;
    String gender;
    int age;

    public void setInfo(String name, double salary, String gender, int age) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Gender: " + gender + ", Age: " + age + ", Salary: " + salary;
    }
}


