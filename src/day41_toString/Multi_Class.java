package day41_toString;

public class Multi_Class {
    public static void main(String[] args) {
        System.out.println("class 1");
    }

}


class test1{ // ===== only visible within this package
    public static void main(String[] args) {
        System.out.println("class 2");
    }

}

class test2{
    public static void main(String[] args) {
        System.out.println("class 3");

    }
}
