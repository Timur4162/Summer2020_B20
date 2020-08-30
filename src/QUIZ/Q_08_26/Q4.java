package QUIZ.Q_08_26;

public class Q4 {

    static String studentName = "Mike";

    static {
        studentName = "Jordan";
    }

    public static void main(String[] args) {
        studentName = "Jean";
        System.out.println(studentName);
    }
// I answered a Jean before by my own

}
