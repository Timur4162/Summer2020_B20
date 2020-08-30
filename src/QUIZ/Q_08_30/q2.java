package QUIZ.Q_08_30;

public class q2 {
    public q2(){
        System.out.println("A");
    }
    public q2(int a){
        this();
        System.out.println("B");
    }
    public q2(String str){
        this();
  //     this(100);
        System.out.println(str);
    }

    public static void main(String[] args) {
        q2 obj = new q2();
    }
}
