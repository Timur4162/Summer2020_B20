package day39_CustomClass;

public class Dog {
    /*
    Instance variables:
        breed, size, age, color

    Instance methods:
        setDogInfo, getDogInfo, eat, drink, sleep,...
     */

    String name;
    String breed;      //   These are INSTANCE variables
    String size;
    int age;
    String color;


    public void setDogInfo (String dogName, String dogBreed, String dogSize, int dogAge, String dogColor){
        name = dogName;
        breed = dogBreed;       // Sets the info of the dog
        size = dogSize;
        age = dogAge;
        color = dogColor;


    }

    /*
    dog1 = Husky
    dog2 = Pitbull
    dog3 = Golden retriever
     */

    public void getDogInfo(){
        System.out.println("Name: "+name+", Breed: "+breed+", Size: "+size+", Color: "+color+", Age: "+age+" year(s) old");
    }


    public void eat(String food){
        System.out.println(name + " is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name+ " is drinking "+drink);
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    public void play(){
        System.out.println(name + " is playing");
    }


















}
