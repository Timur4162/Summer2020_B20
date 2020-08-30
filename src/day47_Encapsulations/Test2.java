package day47_Encapsulations;

public class Test2 {

    static int a = 200;

    static {
        a = 300;
    }

    public Test2(){ // if no object created   (new Test2(); ) constructor won't execute
        a = 400;
    }


    public static void main(String[] args) {
        new Test2(); // 400
        a = 600; // 600
        System.out.println(a);//  300
    }


}
