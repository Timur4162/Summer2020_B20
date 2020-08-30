package QUIZ.Q_08_30;

public class q3 {
    public q3(){
        System.out.println("A");
    }
    public q3(int a){
        this(2.5);
        System.out.println("B");
    }
    public q3(double c){
        this();
        System.out.println("C");
    }

    public static void main(String[] args) {
        q3 obj = new q3(100);
    }
}
