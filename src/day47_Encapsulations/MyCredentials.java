package day47_Encapsulations;

public class MyCredentials {

    public static void main(String[] args) {

        Credentials obj1 = new Credentials("Mike", 34);

        //obj1.Username = "Cybertek";
        obj1.setUsername("Cybertek");
        obj1.setPassword("Cybertek12345");

        System.out.println(obj1.getUsername());
        System.out.println(obj1.getPassword());

        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj1.companyName);

    }
}
