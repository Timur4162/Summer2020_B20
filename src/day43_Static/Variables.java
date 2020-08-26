package day43_Static;

public class Variables {
    int d;
    static int s;

    public void method2(){
        System.out.println(d);
    }

    public static void main(String[] args) {
      //  System.out.println(a);
        System.out.println(s);
      //  System.out.println(d);

        Variables obj = new Variables();  // == only the way to call variables/ STATIC DOESNT EXCEPT ANYTHING BUT STATIC
        System.out.println(obj.d);// STATIC EXCEPS ONLY STATIC

    }


    public static void method1 () {
        int a = 10;  //  LOCAL Variable = int a; <= don't work => int a = 10; <= WORKS

        if (true){
            int b=20;
        }
       // System.out.println(a);
     //   System.out.println(b);


    }
}

