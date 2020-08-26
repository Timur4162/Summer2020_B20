package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects2 {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setCatInfo("Cass", 11, 'M', "Black", "Persian");

        Cat[] catPark = {cat1, new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};

        catPark[1].setCatInfo("Ruby", 3, 'F', "Red", "Persian");
        catPark[2].setCatInfo("Sam", 2, 'M', "Grey", "Sphynx");
        catPark[3].setCatInfo("Judy", 1, 'F', "Brown", "Bengal");
        catPark[4].setCatInfo("Tom", 6, 'M', "Grey", "American Shorthair");
        catPark[5].setCatInfo("Lord", 8, 'M', "White", "Maine Coon");

        ArrayList<Cat> femaleCats = new ArrayList<>();
        femaleCats.addAll(Arrays.asList(catPark) );
        femaleCats.removeIf(p-> p.gender == 'M');

        ArrayList<Cat> maleCats = new ArrayList<>();
        maleCats.addAll(Arrays.asList(catPark));
        maleCats.removeAll(femaleCats);
      //   maleCats.removeIf(p->p.gender == 'F'); ====== SAME RESULT

        System.out.println("Number of female cats: " + femaleCats.size());
        System.out.println("Number of male cats: " + maleCats.size());



    }


}
