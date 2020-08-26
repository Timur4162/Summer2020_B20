package day42_Static;

public class Student {

// they are belongs to the object
    String name; //  INSTANCE VARIABLES
    int age;
    int groupNumber;
    char gender;

    static String schoolName = "Cybertek School";   // belongs to the class  === STATIC VARIABLE
    static String favoriteTeacher = "Nadir";

    public void setInfo(String name, int age, int groupNumber, char gender){
        this.name = name;
        this.age = age;
        this.groupNumber= groupNumber;
        this.gender = gender;
    }

    public String toString (){  // INSTANCE METHOD cos it hasn't got STATIC
        // except INSTANCE AND NOT INSTANCE

        return "School Name: " + schoolName + "\nStudent name: "+name;
//                              static variable                 instance variables
    }

}
