package QUIZ.Q_08_26;

public class Q1 {
    static int a;
    int b;

    public static void main(String[] args) {

        Q1 obj1 = new Q1();
        obj1.b = 10;
        obj1.a = 20;

        Q1 obj2 = new Q1();
        obj2.b = 30;
        obj2.a = 40;
        System.out.println(obj1.a + " " + obj1.b);
        System.out.println(obj2.a + " " + obj2.b);
    }

}
