package day47_Encapsulations;

import java.time.LocalDate;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Muha", 33, 'M', LocalDate.of(1999, 12, 12));
        System.out.println(person1);

        person1.setSsn(9876544);
        person1.setID(123123);
        person1.setAddress("California beach");

        System.out.println("SSN: " + person1.getSsn());
        System.out.println("ID: " + person1.getID());
        System.out.println("Address: " + person1.getAddress());

    }

}
