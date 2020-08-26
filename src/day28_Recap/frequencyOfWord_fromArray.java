package day28_Recap;

public class frequencyOfWord_fromArray {
    public static void main(String[] args) {
/*
write a program that can count the frequency of a word from an array of string
            Ex:
                arr: {"Java", "C#", "Python", "Java"};
                word: "java"
                output:
                        2
            MUST USE for each loop and continue

 */
        String[] arr = {"Java", "C#", "Python", "Java", "java","JaVa"};
        String word = "java";

        int count = 0;

        for (String each : arr){
            if (!word.equalsIgnoreCase(each)){       //   if (word.equalsIgnoreCase(each)){
                continue;            //  <====  or count++;

            }
            count++;                //  delete
        }


        System.out.println(count);



















    }

}
