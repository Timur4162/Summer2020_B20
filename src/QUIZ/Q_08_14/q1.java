package QUIZ.Q_08_14;

public class q1 {

    public static void main(String[] args) {

   //     method1();



        method2("the sun set quickly and created a shadow");

        method3(50);

        //   int result = method4("z","zebra");
        // System.out.println(result);

    }

  /*  public static void method1(){

        int n = -5;
        for (int i =1; i < 5;i++){
            n *= i;
        }
        System.out.println(n);

    }
    //==========================
*/
    public static void method2 (String s){
        String a = s.substring(10);
        if (a.length() >s.length()){
            System.out.println(a);
        } else {
            System.out.println(s);
        }

    }

    public static String method3(int num){

        if (num < 0){
            return "Less than 0";
        } else if (num < 50){
            return "Less than 50";
        }else if (num < 100){
            return "Less than 100";
        }else {
            return "Other";
        }
    }

    public static int method4 (char c, String s){

        if (s.contains("" + c)){
            return 1;
        }else{
            return 0;
        }
    }

}
