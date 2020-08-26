package replit;
// Write a code to type each word in separate lines in a reverse order
import java.util.Scanner;

public class Arrays_Reverse_sentence_137 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();


        //TODO: Type your code below
        String[] words = sentence.split(" ");

        for(int i =  words.length-1;i>=0; i--){
            System.out.println(words[i]);
        }

    }
}