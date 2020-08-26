package day29_Customethods;

public class RemoveDuplicats {
    //write a method that can remeove the duplicates from the string
    public static void main(String[] args) {
        String str = "abababababbabababababcccccccdddddeeeeee";  // abcde
        removeDup(str);
    }
    public static void removeDup(String str) {
        String nonDup = "";

        for (String each : str.split("")) {
            if (!nonDup.contains(each)) {
                nonDup += each;
            }
        }
        System.out.println(nonDup);
    }


}
