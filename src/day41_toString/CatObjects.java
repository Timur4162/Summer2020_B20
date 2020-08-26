package day41_toString;

import java.util.ArrayList;

public class CatObjects {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setCatInfo("Cass", 11, 'F', "Black", "Persian");

        System.out.println(cat1);
        System.out.println("=========================================================");

        Cat[] catPark = {cat1, new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};
        catPark[1].setCatInfo("Ruby", 3, 'F', "Red", "Persian");
        catPark[2].setCatInfo("Sam", 2, 'M', "Grey", "Sphynx");
        catPark[3].setCatInfo("Judy", 1, 'F', "Brown", "Bengal");
        catPark[4].setCatInfo("Tom", 6, 'M', "Grey", "American Shorthair");
        catPark[5].setCatInfo("Lord", 8, 'M', "White", "Maine Coon");


        for (Cat each : catPark) {
            System.out.println(each);
        }

        System.out.println("========================================================");
        //   System.out.println(Arrays.toString(catPark));

        ArrayList<Cat> maleCats = new ArrayList<>();
        ArrayList<Cat> femaleCats = new ArrayList<>();

/*
        for (int i = 0; i <= catPark.length - 1; i++) {
            if (catPark[i].gender == 'M'){
                maleCats.add(catPark[i]);
            }else{
                femaleCats.add(catPark[i]);

            }

        }

 */
        for (Cat each : catPark) {
            if (each.gender =='M'){
                maleCats.add(each);
            }else {
                femaleCats.add(each);
            }
        }

        System.out.println(femaleCats);
        System.out.println(maleCats);




        }
    }
