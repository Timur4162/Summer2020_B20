package day42_Static;

public class StaticMethods {

    int a = 200;
    static int b = 400;

    // static keyword == means its static
    public static void main(String[] args) {
        System.out.println(b);
        //System.out.println(this.a);       === DO NOT WORK
        //System.out.println(a);            === DO NOT WORK

        // the only way to call the instance variable in a static method
        StaticMethods obj = new StaticMethods();
        System.out.println(obj.a);

        staticMethod();
        StaticMethods.staticMethod();
       // instanceMethod();  == can not call it, only can call through the object

        obj.instanceMethod();
       // StaticMethods.instanceMethod(); == cannot be called from the class

    }

    public static void staticMethod(){

    }

    public void instanceMethod(){

    }


}
