package Office_Hours.Practice_07_14_20;

public class Practice_07_14_20_Unique_Words {
    public static void main(String[] args) {
        String[] words = {"C#", "C#","Python", "Python", "Java", "C#"};
                //         1     2      3         4         5
            // for each = represents the elements,
        for (String b : words){

           // String s = words[0];  // "C#"      gives frequency of this variable and assigned to = count
            int count = 0;
            for (String a : words){
                if (a.equals(b)){
                    count++;            // ONE STEP == Needs to repeat 4 more times
                }
            }
            if (count == 3) {   // if needed to print the word which was twice ==> 2   <== find the UNIQUE
                System.out.println(b);          // new approach
            }

        }













    }
}
