package Office_Hours.Practice_08_26;

public class task {

    static int a;

    public static void main(String[] args) {
        a = 1000;
        System.out.println(a);
    }

    static {   // RUNS FIRST = ONLY ONE TIME, no more
        a = 500;
      //  method();  doesn't accept because it's INSTANCE
    }

    public void method(){  // INSTANCE ACCEPTS BOTH = STATIC AND INSTANCE
        System.out.println(a);
    }


}
