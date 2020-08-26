package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Times {

    public static void main(String[] args) {

        LocalTime time = LocalTime.of(14, 55,33);
        System.out.println(time);
        //LocalTime t2 = LocalTime.now();
        System.out.println(time.now());


        LocalDateTime t3 = LocalDateTime.of(2020,7,25, 15,44);
        System.out.println(t3.now());   // or can be assigned to Variable






    }
}
