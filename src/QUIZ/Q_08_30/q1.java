package QUIZ.Q_08_30;

public class q1 {

    public q1(){
        System.out.println("A");
       // this();
    }
    public q1(int a){
        this();
        System.out.println("B ");
    }

    public static void main(String[] args) {
        q1 obj = new q1(200);
    }

}