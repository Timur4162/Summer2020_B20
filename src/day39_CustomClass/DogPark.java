package day39_CustomClass;

public class DogPark {
    public static void main(String[] args) {
        // dogPark
        Dog dog1 = new Dog();

        Dog[] dogPark = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        //              0           1           2          3         4


        dogPark[0].setDogInfo("Tucker", "Rotveller", "Medium", 2, "grey");
        dogPark[1].setDogInfo("Gerard", "Golden retriever", "medium", 1, "Brown");
        dogPark[2].setDogInfo("Batman", "Husky", "Big", 2, "Grey");
        dogPark[3].setDogInfo("Champ", "Shepper", "Large", 5, "Green");
        dogPark[4].setDogInfo("Iren", "German Shepperd", "Small", 4, "Mix");


        // to Iterate the Array we use For Loop
        for (int i = 0; i <= dogPark.length - 1; i++) {  // i = each of the objects in dogPark array
            dogPark[i].getDogInfo();  //

        }

        System.out.println("==================================================");

        // the same execution
        for (Dog eachDog : dogPark) {
            eachDog.getDogInfo();
        }

        System.out.println("=================================================");


        //   FEED DOGs
        String food = "treats";

        for (Dog eachFood : dogPark) {
            eachFood.eat(food);
        }


        System.out.println("=================================================");



        String drink = "milk";

        for (int i = 0; i <= dogPark.length - 1; i++){
            dogPark[i].drink(drink);
        }


        System.out.println("=================================================");
        for (Dog eachPlay : dogPark) {
            eachPlay.play();
        }

        System.out.println("=================================================");

        for (Dog eachSleep : dogPark) {
            eachSleep.sleep();
        }
    }
}
