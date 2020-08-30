package QUIZ.Q_08_26;

public class Q3 {

    int score;   // int should be static to execute
    static {
  //      score = 75;
    }

    public static void main(String[] args) {
        Q3 obj = new Q3();
        obj.score = 85;
        System.out.println(obj.score);
    }
}
