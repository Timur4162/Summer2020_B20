package day28_Recap;

public class Frequency_of_word2 {
    public static void main(String[] args) {
        String str = "catcatcatdogdogsnakesnakesnakesnake";
        // 0, 3
        /*
        Scanner scan  =new Scanner(System.in);
        String str = scan.nextLine();
        String word = scan.next();
        int l = word.length();

        for (int i = 0; i <= str.length()-l;i++){       // if str.substring (i,i+3) here must be -3
            str.substring(i,i+3);   // i should be the last index
            if (str.substring(i,i+l).equalsIgnoreCase("cat")){
                count++;
         */
// charAt better to use with single character

        int count = 0; // cat
        int count1 = 0;
        int count3 = 0;

        for (int i = 0; i <= str.length()-3;i++){       // if str.substring (i,i+3) here must be -3
            str.substring(i,i+3);   // i should be the last index
            if (str.substring(i,i+3).equalsIgnoreCase("cat")){
                count++; // if (str.substring(i,i+3).equals("cat") =true, the count frequency will increase by 1
            }
        }
        for (int i = 0; i <= str.length()-3;i++){       // if str.substring (i,i+3) here must be -3
            str.substring(i,i+3);   // i should be the last index
            if (str.substring(i,i+3).equalsIgnoreCase("dog")){
                count1++; // if (str.substring(i,i+3).equals("cat") =true, the count frequency will increase by 1
            }
        }
        for (int i = 0; i <= str.length()-5;i++){       // if str.substring (i,i+3) here must be -3
            str.substring(i,i+5);   // i should be the last index
            if (str.substring(i,i+5).equalsIgnoreCase("snake")){ // if SNAKE ===> the length()-5    <====   -5
                count3++; // if (str.substring(i,i+3).equals("cat") =true, the count frequency will increase by 1
            }
        }

        System.out.println(count);
        System.out.println(count1);
        System.out.println(count3);











    }
}
