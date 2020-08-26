package day35_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    /*
    ArrayList methods
    add() : = increase the size

    set(index, newElement): = replacing the old element at given index with new element
                                for setting spec object which has array

    remove(int primitive): = removes the element at the given index. ONLY REMOVES ONE

    remove(non-primitive): = removes the element NOT THE INDEX,
                             first matching element will be removed from the list
                             returns the BOOLEAN

    clear(): =     sets the size to 0 (zero)
     */
    public static void main(String[] args) {

        ArrayList<String> earlyBirdList = new ArrayList<>();
        earlyBirdList.add("Ibrahim");   // 0
        earlyBirdList.add("Virginia");  // 1
        earlyBirdList.add("Ziiadin");   // 2
        earlyBirdList.add("Efran");     // 3
        earlyBirdList.add("Alia");      // 4


        // earlyBirdList.add(2, "Aslan");  === just adding the element 2
        earlyBirdList.set(2, "Aslan");      // === replacing the element
        earlyBirdList.set(0, "Aihan");

        System.out.println(earlyBirdList);
        earlyBirdList.clear();

        System.out.println(earlyBirdList);
        System.out.println(earlyBirdList.size());
        System.out.println("=================================================");

        // remove(int index)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);    // 0
        list.add(2);    // 1
        list.add(3);    // 2
        list.add(4);    // 3
        list.add(5);    // 4

        list.remove(2);    // 1, 2, 4, 5 === removed index number 2 (3)
        System.out.println(list);

        System.out.println("=================================================");

        // remove(Element)
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);    // 0
        list2.add(2);    // 1
        list2.add(3);    // 2
        list2.add(4);    // 3
        list2.add(5);    // 4

        //int a = 1;   element the Element under index = 1 ( 2 ) [ 1, 3, 4, 5 ]
        Integer a = 1; // removes the element 1 ( 1 )  [ 2, 3, 4, 5 ]

        list2.remove(a);

        System.out.println(list2);

        // remove (Element)
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Hamit");     // 0
        list3.add("Lilia");     // 1
        list3.add("Bulnet");    // 2
        list3.add("Viorel");    // 3
        list3.add("Musa");      // 4

       // list3.remove(2); // Bulnet

       boolean r = list3.remove("Bulnet");        // true
        // list3.remove("bulnet");           // passing the non-primitive
        list3.remove("Musa");
        System.out.println(list3);
        System.out.println(r);

    }
}
