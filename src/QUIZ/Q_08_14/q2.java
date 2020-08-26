package QUIZ.Q_08_14;

public class q2 {

  /*  public static  boolean method5(String str){
        boolean check = true;

        if (str.isEmpty()){
            check = false;
        }

        if (!str.contains("a")){
            check =false;

        }else if (str.contains("z")){
            check = false;
        }

        check = str.substring(0,1).equals("a") ? check : false;
        return check;


    }
    */
    public static void main(String[] args) {
        System.out.println("apple");
    }

    public static int [] method6(String str){
        int[]arr = new int[str.length()];
        int n = 10;

        for(int i=0;i<arr.length;i++){
            if (n==20 ||n==50||n==70){
                continue;
            }
            arr[i] = n;
            n*=10;

        }
        return arr;
    }

    // public static void main(String[] args) {
    //    System.out.println(method6("mark"));
    }



