package QUIZ.Q_08_14;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class q8 {
    public static void main(String[] args) {



    LocalTime time = LocalTime.now();
    DateTimeFormatter format = DateTimeFormatter.ofPattern("h:mm a");
    time.plusHours(2);

        System.out.println(time.format(format));
}
}
