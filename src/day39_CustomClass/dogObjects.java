package day39_CustomClass;

public class dogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setDogInfo("Batman", "Husky", "Big", 2, "Grey");
        dog2.setDogInfo("Butller", "Pitbull", "Small", 3,"White");
        dog3.setDogInfo("Gerard", "Golden retriever", "medium", 1, "Brown");

        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();

        dog1.eat("Kelle Paca");
        dog2.eat("Steak");
        dog3.eat("Polo");

        dog3.drink("Cola");
        dog1.drink("Milk");
        dog2.drink("Redbull");

        dog1.sleep();

        dog1.play();



    }
}
