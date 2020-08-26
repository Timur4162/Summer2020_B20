package day31_Recap;

/*
1.  write a return method called frequency that accepts two parameters: string str and char ch, the method returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays and for each loop

 */
public class warmUpTasks {

    public static void main(String[] args) {

        String str = "aabccdddddeeeefggggggerty";

        String uniques = "";  //"bd"


        //for (int i = 0; i <= str.length() - 1; i++) {
        //    char ch = str.charAt(i);

        for (char each : str.toCharArray()) {
            int count = frequency(str, each);

            if (count == 1) {
                uniques += each;
            }

        }

        System.out.println(uniques);
        System.out.println("================================");
        String str2 = "ppppoiiiiuuuuutttttr";
        String uniques2=uniques(str2);
        System.out.println(uniques2);

    }


    public static int frequency(String str, char ch) {   // finds the frequency of char from String str
        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }


    public static String uniques(String str) {
        String uniques = "";

        for (char each : str.toCharArray()) {
            int count = frequency(str, each);  // frequency of every character
            if (count == 1) {
                uniques += each;
            }

        }
        return uniques;
    }
}
